package com.ddd_bootcamp.threetier.controller.viewModel;

import java.util.List;

public class CustomerRequest {
    private AddressRequest addressRequest;
    private AccountRequest accountRequest;

    public CustomerRequest() {
    }

    //needed for spring framework
    public AddressRequest getAddressRequest() {
        return addressRequest;
    }

    //needed for spring framework
    public void setAddressRequest(AddressRequest addressRequest) {
        this.addressRequest = addressRequest;
    }

    public AccountRequest getAccountRequest() {
        return accountRequest;
    }

    public void setAccountRequest(AccountRequest accountRequest) {
        this.accountRequest = accountRequest;
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "addressRequest=" + addressRequest +
                ", accountRequest=" + accountRequest +
                '}';
    }
}
