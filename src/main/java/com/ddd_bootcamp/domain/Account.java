package com.ddd_bootcamp.domain;

import java.util.UUID;

public class Account implements Entity<Account> {

    private AccountId accountId;
    private Address address;

    public Account() {
        this.accountId = new AccountId(UUID.randomUUID());
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
        return accountId.getAccountIdUUID().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return accountId.equals(account.accountId);
    }

    @Override
    public int hashCode() {
        return accountId.hashCode();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean hasSameIdentityAs(Account o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return accountId.equals(o.getAccountId());
    }
}
