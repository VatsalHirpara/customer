package com.nagarro.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.customer.domain.Customer;
import com.nagarro.customer.domain.Notification;
import com.nagarro.customer.service.CustomerService;
import com.nagarro.customer.service.NotificationService;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    
    @Autowired
    NotificationService notificationService;
    
    @GetMapping
    public List<Customer> getCustomers() {
	return customerService.getAllCustomers();
    }
    
    @PostMapping
    public String addNotification(Notification Notification) {
    	return notificationService.addNotification(Notification);
    }
    
}
			