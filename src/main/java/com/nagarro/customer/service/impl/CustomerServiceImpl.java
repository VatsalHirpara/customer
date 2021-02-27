package com.nagarro.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.nagarro.customer.domain.CustomerEntity;
import com.nagarro.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    private List<CustomerEntity> customersList = new ArrayList<>();

    /**
     * populates data into list after object is created.
     */
    @PostConstruct
    public void populateData() {
	CustomerEntity customer1 = new CustomerEntity();
	customer1.setId(1);
	customer1.setName("Amit Saxena");
	customer1.setEmail("amit@gmail.com");
	customer1.setCity("Gurugram");
	customer1.setAddress("OM, sector 18, opp mall, gugrugram");
	CustomerEntity customer2 = new CustomerEntity();
	customer2.setId(2);
	customer2.setName("Karan Patel");
	customer2.setEmail("Raj@gmail.com");
	customer2.setCity("Noida");
	customer2.setAddress("Pretige heights, sector 56, Noida");
	CustomerEntity customer3 = new CustomerEntity();
	customer3.setId(3);
	customer3.setName("Rohit Sharma");
	customer3.setEmail("Rohit@gmail.com");
	customer3.setCity("Delhi");
	customer3.setAddress("Lotus panache, sector 17A, Delhi");
	customersList.add(customer1);
	customersList.add(customer2);
	customersList.add(customer3);
    }

    public List<CustomerEntity> getAllCustomers() {
	return this.customersList;
    }

}
