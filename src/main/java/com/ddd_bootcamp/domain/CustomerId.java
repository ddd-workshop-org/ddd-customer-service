package com.ddd_bootcamp.domain;

import java.util.UUID;

public class CustomerId {

    private UUID customerId;

    public CustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerId that = (CustomerId) o;

        return customerId.equals(that.customerId);
    }

    @Override
    public int hashCode() {
        return customerId.hashCode();
    }

    @Override
    public String toString() {
        return "CustomerId{" +
                "customerId=" + customerId +
                '}';
    }
}
