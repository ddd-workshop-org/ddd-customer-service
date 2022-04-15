package com.ddd_bootcamp.threetier.repository;

import com.ddd_bootcamp.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//Customer Repository or Data Access Layer
//Using in-memory map instead of db for demo

@Repository
public class CustomerRepository {

    private Map<UUID, Customer> customerMap = new HashMap<>();

    public Customer save(Customer customer) {
        System.out.println("in Repository customer = " + customer);
        customerMap.put(customer.getCustomerId(), customer);
        return customer;
    }

    public Customer find(UUID customerId) {
        return customerMap.get(customerId);
    }
}
