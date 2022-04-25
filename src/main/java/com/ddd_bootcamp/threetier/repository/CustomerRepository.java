package com.ddd_bootcamp.threetier.repository;

import com.ddd_bootcamp.domain.Customer;
import com.ddd_bootcamp.domain.CustomerId;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

//Customer Repository or Data Access Layer
//Using in-memory map instead of db for demo

@Repository
public class CustomerRepository {

    private Map<CustomerId, Customer> customerMap = new HashMap<>();

    public Customer save(Customer customer) {
        System.out.println("in Repository customer = " + customer);
        customerMap.put(customer.getCustomerId(), customer);
        return customer;
    }

    public Customer find(CustomerId customerId) {
        return customerMap.get(customerId);
    }
}
