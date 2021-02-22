package com.nagarro.customer.Customer.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.nagarro.customer.domain.Customer;
import com.nagarro.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    private List<Customer> customersList = new ArrayList<>();

    /**
     * populates data into list after object is created.
     */
    @PostConstruct
    public void populateData() {
	Customer customer1 = new Customer();
	customer1.setId(1);
	customer1.setName("Amit Saxena");
	customer1.setEmail("amit@gmail.com");
	customer1.setCity("Gurugram");
	customer1.setAddress("OM, sector 18, opp mall, gugrugram");
	Customer customer2 = new Customer();
	customer2.setId(2);
	customer2.setName("Karan Patel");
	customer2.setEmail("Raj@gmail.com");
	customer2.setCity("Noida");
	customer2.setAddress("Pretige heights, sector 56, Noida");
	Customer customer3 = new Customer();
	customer3.setId(3);
	customer3.setName("Rohit Sharma");
	customer3.setEmail("Rohit@gmail.com");
	customer3.setCity("Delhi");
	customer3.setAddress("Lotus panache, sector 17A, Delhi");
	customersList.add(customer1);
	customersList.add(customer2);
	customersList.add(customer3);
    }

    public List<Customer> getAllCustomers() {
	return this.customersList;
    }

}
