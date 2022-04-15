package com.ddd_bootcamp.threetier.controller.resource;

import com.ddd_bootcamp.domain.Customer;

import java.util.List;
import java.util.UUID;

public class CustomerResource {
    private UUID customerId;
    private AddressData addressData;
    private List<AccountData> accountDataList;

    public CustomerResource() {

    }

    public CustomerResource from(Customer newCustomer) {
        CustomerResource customerResource = new CustomerResource();
        customerResource.setCustomerId(newCustomer.getCustomerId());
        AddressData addressData = new AddressData();
        addressData.setCity(newCustomer.getAddress().getCity());
        customerResource.setAddressData(addressData);

        return  customerResource;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public AddressData getAddressData() {
        return addressData;
    }

    public void setAddressData(AddressData addressData) {
        this.addressData = addressData;
    }

    public List<AccountData> getAccountDataList() {
        return accountDataList;
    }

    public void setAccountDataList(List<AccountData> accountDataList) {
        this.accountDataList = accountDataList;
    }
}
