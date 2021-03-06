package com.ddd_bootcamp.threetier.applicationservice;

import com.ddd_bootcamp.domain.Account;
import com.ddd_bootcamp.domain.Address;
import com.ddd_bootcamp.domain.Customer;
import com.ddd_bootcamp.domain.CustomerId;
import com.ddd_bootcamp.threetier.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomerAppService {

    private CustomerRepository customerRepository;

    public CustomerAppService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //@Transactional
    public Customer createCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

    //@Transactional
    public Customer updateAddress(CustomerId customerId, Address address) {
        Customer customer = customerRepository.find(customerId);
        customer.updateAddress(address);
        return customerRepository.save(customer);
    }

    //@Transactional
    public Customer addAccount(CustomerId customerId, Account account) {
        Customer customer = customerRepository.find(customerId);
        customer.addAccount(account);
        return customerRepository.save(customer);
    }
}
