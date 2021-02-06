// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract Ledger {

    enum LedgerType {
        ASSET, LIABILITY, EQUITY, REVENUE, EXPENSE
    }

    uint public id;
    string public identifier;
    string public name;
    LedgerType public ledgerType;
    uint public totalValue;
    string public description;
    bool public showAccountsInChart;
    uint public parentLedgerId;

    constructor(uint _id, string memory _identifier, string memory _name,
        string memory _ledgerTypeAsString, uint _totalValue, string memory _description,
        bool _showAccountsInChart, uint _parentLedgerId) public {

        LedgerType _ledgerType;

        bytes32 _hashedLedgerType = hashString(_ledgerTypeAsString);

        if (_hashedLedgerType == hashString("ASSET")) {
            _ledgerType = LedgerType.ASSET;
        } else if (_hashedLedgerType == hashString("LIABILITY")) {
            _ledgerType = LedgerType.LIABILITY;}
        else if (_hashedLedgerType == hashString("EQUITY")) {
            _ledgerType = LedgerType.EQUITY;
        } else if (_hashedLedgerType == hashString("REVENUE")) {
            _ledgerType = LedgerType.REVENUE;
        } else if (_hashedLedgerType == hashString("EXPENSE")) {
            _ledgerType = LedgerType.EXPENSE;
        } else {
            revert("Provided unknown LedgerType!");
        }

        id = _id;
        identifier = _identifier;
        name = _name;
        ledgerType = _ledgerType;
        totalValue = _totalValue;
        description = _description;
        showAccountsInChart = _showAccountsInChart;
        parentLedgerId = _parentLedgerId;
    }

    function hashString(string memory _rawString) private pure returns (bytes32) {
        return keccak256(abi.encodePacked(_rawString));
    }
}
