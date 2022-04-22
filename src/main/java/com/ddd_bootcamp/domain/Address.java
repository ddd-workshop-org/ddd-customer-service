package com.ddd_bootcamp.domain;

public class Address implements ValueObject<Address> {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }

    @Override
    public boolean sameValueAs(Address o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return city.equals(o.getCity());
    }
}
