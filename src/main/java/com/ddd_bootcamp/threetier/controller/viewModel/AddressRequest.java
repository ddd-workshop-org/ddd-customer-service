package com.ddd_bootcamp.threetier.controller.viewModel;

public class AddressRequest {
    private String city;

    //needed for spring framework
    public AddressRequest() {
    }

    //needed for spring framework
    public String getCity() {
        return city;
    }

    //needed for spring framework
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "AddressRequest{" +
                "city='" + city + '\'' +
                '}';
    }
}
