package com.ddd_bootcamp.domain;

import java.util.UUID;

public class Account {

    private AccountId accountId;
    private Address address;

    public Account() {
        this.accountId =  new AccountId(UUID.randomUUID());
    }
    protected void updateAddress(Address address) {
        this.address = address;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Address getAddress() {
        return address;
    }

    public String getAccountIdAsString() {
        return  accountId.getAccountIdUUID().toString();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", address=" + address +
                '}';
    }
}
