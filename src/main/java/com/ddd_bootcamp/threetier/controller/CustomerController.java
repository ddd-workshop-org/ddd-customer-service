package com.ddd_bootcamp.threetier.controller;

import com.ddd_bootcamp.domain.Account;
import com.ddd_bootcamp.domain.Address;
import com.ddd_bootcamp.domain.Customer;
import com.ddd_bootcamp.domain.CustomerId;
import com.ddd_bootcamp.threetier.applicationservice.CustomerAppService;
import com.ddd_bootcamp.threetier.controller.resource.CustomerResource;
import com.ddd_bootcamp.threetier.controller.viewModel.AccountRequest;
import com.ddd_bootcamp.threetier.controller.viewModel.AddressRequest;
import com.ddd_bootcamp.threetier.controller.viewModel.CustomerRequest;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class CustomerController {

    private final CustomerAppService customerAppService;

    public CustomerController(CustomerAppService customerAppService) {
        this.customerAppService = customerAppService;
    }

    @PostMapping("/customers")
    public CustomerResource create(@RequestBody CustomerRequest request) {
        System.out.println("request = " + request);

        Customer customer = customerAppService.createCustomer(
                new Customer(new Address(request.getAddressRequest().getCity())));

        return CustomerResource.from(customer);
    }

    @PostMapping("/customers/{customerId}/accounts")
    public CustomerResource createAccount(@RequestBody AccountRequest request, @PathVariable String customerId) {
        System.out.println("request = " + request);
        System.out.println("PathVariable = " + customerId);

        Customer customer = customerAppService.addAccount(new CustomerId(UUID.fromString(customerId)), new Account());

        return CustomerResource.from(customer);
    }

    @PutMapping("/customers/{customerId}/address")
    public CustomerResource updateAddress(@RequestBody AddressRequest request, @PathVariable String customerId) {
        System.out.println("request = " + request);
        System.out.println("PathVariable = " + customerId);

        Customer customer = customerAppService.updateAddress(new CustomerId(UUID.fromString(customerId)),
                new Address(request.getCity()));

        return CustomerResource.from(customer);
    }


}
