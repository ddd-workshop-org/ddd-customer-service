package com.ddd_bootcamp.threetier.repository;

import com.ddd_bootcamp.domain.Customer;
import org.springframework.stereotype.Repository;

//Customer Repository or Data Access Layer
//Using in-memory map instead of db for demo

@Repository
public class CustomerRepository {

    public void save(Customer customer) {
        System.out.println("in Repository customer = " + customer);
    }

}
