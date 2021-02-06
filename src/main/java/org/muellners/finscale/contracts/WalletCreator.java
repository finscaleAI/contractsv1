package org.muellners.finscale.contracts;

import org.muellners.finscale.contracts.common.GanacheGasProvider;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthCoinbase;
import org.web3j.protocol.core.methods.response.EthGetTransactionCount;
import org.web3j.protocol.http.HttpService;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class WalletCreator {

    public static void createIfNotExists(String nodeUrl, String walletPassword, String walletPath) throws CipherException,
            InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException, IOException {

        Web3j web3j = Web3j.build(new HttpService(nodeUrl));
        File walletFile = new File(walletPath);

        if (!walletFile.exists()) {
            String tempFile = WalletUtils.generateLightNewWalletFile(walletPassword, new File(walletFile.getParent()));
            File temporaryWalletFile = new File(walletFile.getParent(), tempFile);
            temporaryWalletFile.renameTo(walletFile);

            Credentials credentials = WalletUtils.loadCredentials(walletPassword, walletFile);
            EthCoinbase coinbase = web3j.ethCoinbase().send();
            EthGetTransactionCount transactionCount = web3j.ethGetTransactionCount(coinbase.getAddress(), DefaultBlockParameterName.LATEST).send();
            Transaction transaction = Transaction.createEtherTransaction(coinbase.getAddress(), transactionCount.getTransactionCount(),
                    GanacheGasProvider.GAS_PRICE, GanacheGasProvider.GAS_LIMIT, credentials.getAddress(), BigInteger.valueOf(25_000_000_000_000_000L));
            web3j.ethSendTransaction(transaction).send();
        }
    }
}
