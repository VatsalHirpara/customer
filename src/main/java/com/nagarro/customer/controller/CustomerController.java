package com.nagarro.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.customer.domain.Customer;
import com.nagarro.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    
    @GetMapping
    public List<Customer> getCustomers() {
	return customerService.getAllCustomers();
    }
    
}
