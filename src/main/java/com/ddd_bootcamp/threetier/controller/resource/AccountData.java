package com.ddd_bootcamp.threetier.controller.resource;

import com.ddd_bootcamp.domain.Account;

import java.util.UUID;

public class AccountData {
    private UUID accountId;

    private AddressData addressData;

    public AccountData() {
    }
    public static AccountData from(Account account) {
        AccountData accountData = new AccountData();
        accountData.setAccountId(account.getAccountId().getAccountIdUUID());
        accountData.setAddressData(AddressData.from(account.getAddress()));
        return accountData;
    }

    public AddressData getAddressData() {
        return addressData;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public void setAddressData(AddressData addressData) {
        this.addressData = addressData;
    }


}
