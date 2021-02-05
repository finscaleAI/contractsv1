package org.muellners.finscale.contracts.generated.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.8.4.
 */
@SuppressWarnings("rawtypes")
public class Ledger extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b5060405161073b38038061073b833981810160405261010081101561003457600080fd5b81516020830180516040519294929383019291908464010000000082111561005b57600080fd5b90830190602082018581111561007057600080fd5b825164010000000081118282018810171561008a57600080fd5b82525081516020918201929091019080838360005b838110156100b757818101518382015260200161009f565b50505050905090810190601f1680156100e45780820380516001836020036101000a031916815260200191505b506040526020018051604051939291908464010000000082111561010757600080fd5b90830190602082018581111561011c57600080fd5b825164010000000081118282018810171561013657600080fd5b82525081516020918201929091019080838360005b8381101561016357818101518382015260200161014b565b50505050905090810190601f1680156101905780820380516001836020036101000a031916815260200191505b50604052602001805160405193929190846401000000008211156101b357600080fd5b9083019060208201858111156101c857600080fd5b82516401000000008111828201881017156101e257600080fd5b82525081516020918201929091019080838360005b8381101561020f5781810151838201526020016101f7565b50505050905090810190601f16801561023c5780820380516001836020036101000a031916815260200191505b5060408181526020830151920180519294919391928464010000000082111561026457600080fd5b90830190602082018581111561027957600080fd5b825164010000000081118282018810171561029357600080fd5b82525081516020918201929091019080838360005b838110156102c05781810151838201526020016102a8565b50505050905090810190601f1680156102ed5780820380516001836020036101000a031916815260200191505b50604090815260208201519101519092509050600080610315876401000000006105d6810204565b90506103646040518060400160405280600581526020017f41535345540000000000000000000000000000000000000000000000000000008152506105d6640100000000026401000000009004565b811415610374576000915061054f565b6103c16040518060400160405280600981526020017f4c494142494c49545900000000000000000000000000000000000000000000008152506105d6640100000000026401000000009004565b8114156103d1576001915061054f565b61041e6040518060400160405280600681526020017f45515549545900000000000000000000000000000000000000000000000000008152506105d6640100000000026401000000009004565b81141561042e576002915061054f565b61047b6040518060400160405280600781526020017f524556454e5545000000000000000000000000000000000000000000000000008152506105d6640100000000026401000000009004565b81141561048b576003915061054f565b6104d86040518060400160405280600781526020017f455850454e5345000000000000000000000000000000000000000000000000008152506105d6640100000000026401000000009004565b8114156104e8576004915061054f565b604080517f08c379a000000000000000000000000000000000000000000000000000000000815260206004820152601c60248201527f50726f766964656420756e6b6e6f776e204c6564676572547970652100000000604482015290519081900360640190fd5b60008a905588516105679060019060208c019061064d565b50875161057b9060029060208b019061064d565b506003805483919060ff1916600183600481111561059557fe5b0217905550600486905584516105b290600590602088019061064d565b50506006805460ff191693151593909317909255600755506106ee95505050505050565b6000816040516020018082805190602001908083835b6020831061060b5780518252601f1990920191602091820191016105ec565b6001836020036101000a038019825116818451168082178552505050505050905001915050604051602081830303815290604052805190602001209050919050565b828054600181600116156101000203166002900490600052602060002090601f01602090048101928261068357600085556106c9565b82601f1061069c57805160ff19168380011785556106c9565b828001600101855582156106c9579182015b828111156106c95782518255916020019190600101906106ae565b506106d59291506106d9565b5090565b5b808211156106d557600081556001016106da565b603f806106fc6000396000f3fe6080604052600080fdfea2646970667358221220d046e6a60b0197fa96ef1cffe10556294555226da9ea1868087de2d3fac0ce0f64736f6c63430007050033";

    @Deprecated
    protected Ledger(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Ledger(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Ledger(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Ledger(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    @Deprecated
    public static Ledger load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Ledger(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Ledger load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Ledger(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Ledger load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Ledger(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Ledger load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Ledger(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Ledger> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, BigInteger _id, String _identifier, String _name, String _ledgerTypeAsString, BigInteger _totalValue, String _description, Boolean _showAccountsInChart, BigInteger _parentLedgerId) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_identifier), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_ledgerTypeAsString), 
                new org.web3j.abi.datatypes.generated.Uint256(_totalValue), 
                new org.web3j.abi.datatypes.Utf8String(_description), 
                new org.web3j.abi.datatypes.Bool(_showAccountsInChart), 
                new org.web3j.abi.datatypes.generated.Uint256(_parentLedgerId)));
        return deployRemoteCall(Ledger.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Ledger> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, BigInteger _id, String _identifier, String _name, String _ledgerTypeAsString, BigInteger _totalValue, String _description, Boolean _showAccountsInChart, BigInteger _parentLedgerId) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_identifier), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_ledgerTypeAsString), 
                new org.web3j.abi.datatypes.generated.Uint256(_totalValue), 
                new org.web3j.abi.datatypes.Utf8String(_description), 
                new org.web3j.abi.datatypes.Bool(_showAccountsInChart), 
                new org.web3j.abi.datatypes.generated.Uint256(_parentLedgerId)));
        return deployRemoteCall(Ledger.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Ledger> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, String _identifier, String _name, String _ledgerTypeAsString, BigInteger _totalValue, String _description, Boolean _showAccountsInChart, BigInteger _parentLedgerId) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_identifier), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_ledgerTypeAsString), 
                new org.web3j.abi.datatypes.generated.Uint256(_totalValue), 
                new org.web3j.abi.datatypes.Utf8String(_description), 
                new org.web3j.abi.datatypes.Bool(_showAccountsInChart), 
                new org.web3j.abi.datatypes.generated.Uint256(_parentLedgerId)));
        return deployRemoteCall(Ledger.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Ledger> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, String _identifier, String _name, String _ledgerTypeAsString, BigInteger _totalValue, String _description, Boolean _showAccountsInChart, BigInteger _parentLedgerId) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_identifier), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_ledgerTypeAsString), 
                new org.web3j.abi.datatypes.generated.Uint256(_totalValue), 
                new org.web3j.abi.datatypes.Utf8String(_description), 
                new org.web3j.abi.datatypes.Bool(_showAccountsInChart), 
                new org.web3j.abi.datatypes.generated.Uint256(_parentLedgerId)));
        return deployRemoteCall(Ledger.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
