package com.ddd_bootcamp.threetier.applicationservice;

import com.ddd_bootcamp.domain.Address;
import com.ddd_bootcamp.domain.Customer;
import com.ddd_bootcamp.threetier.repository.CustomerRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerAppService {

    private CustomerRepository customerRepository;

    public CustomerAppService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        customerRepository.save(customer);
        return new Customer(new Address("ss"));
    }

    public Customer fetchCustomer(UUID customerId) {
        return customerRepository.find(customerId);
    }

    public Customer updateAddress(UUID customerId, Address address) {
        Customer customer = customerRepository.find(customerId);
        //customer.updateAddress(address);
        return customer;
    }
}
