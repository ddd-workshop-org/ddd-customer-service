package com.ddd_bootcamp.threetier.controller;

import com.ddd_bootcamp.domain.Address;
import com.ddd_bootcamp.domain.Customer;
import com.ddd_bootcamp.threetier.applicationservice.CustomerAppService;
import com.ddd_bootcamp.threetier.controller.resource.CustomerResource;
import com.ddd_bootcamp.threetier.controller.viewModel.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerAppService customerAppService;

    public CustomerController(CustomerAppService customerAppService) {
        this.customerAppService = customerAppService;
    }

    @PostMapping("/customers")
    public CustomerResource create(@RequestBody CustomerRequest request) {
        System.out.println("request = " + request);
        Customer customer = customerAppService.createCustomer(new Customer(new Address("pune")));
        return new CustomerResource();
    }
}
