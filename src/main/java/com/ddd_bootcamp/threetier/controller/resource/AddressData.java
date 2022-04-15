package com.ddd_bootcamp.threetier.controller.resource;

import com.ddd_bootcamp.domain.Address;

public class AddressData {
    private String city;

    public AddressData() {
    }

    public static AddressData from(Address address) {
        AddressData addressData = new AddressData();
        addressData.setCity(address.getCity());
        return addressData;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
