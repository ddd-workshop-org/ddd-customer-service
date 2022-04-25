package com.ddd_bootcamp.threetier.controller.resource;

import com.ddd_bootcamp.domain.Account;


public class AccountData {
    private String accountId;

    private AddressData addressData;

    public AccountData() {
    }
    public static AccountData from(Account account) {
        AccountData accountData = new AccountData();
        accountData.setAccountId(account.getAccountIdAsString());
        accountData.setAddressData(AddressData.from(account.getAddress()));
        return accountData;
    }

    public AddressData getAddressData() {
        return addressData;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setAddressData(AddressData addressData) {
        this.addressData = addressData;
    }


}
