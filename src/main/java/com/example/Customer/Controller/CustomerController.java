package com.example.Customer.Controller;

import com.example.Customer.model.Customer;
import com.example.Customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping(path="/customers")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

}
