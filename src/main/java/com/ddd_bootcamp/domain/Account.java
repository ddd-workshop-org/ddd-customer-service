package com.ddd_bootcamp.domain;

import java.util.UUID;

public class Account {

    private UUID accountId;
    private Address address;

    public Account() {
        this.accountId =  UUID.randomUUID();
    }
    protected void updateAddress(Address address) {
        this.address = address;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", address=" + address +
                '}';
    }
}
