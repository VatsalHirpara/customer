package com.nagarro.customer.service;

import java.util.List;

import javax.validation.Valid;

import com.nagarro.customer.domain.CustomerEntity;

public interface CustomerService {

    public List<CustomerEntity> getAllCustomers();

	public CustomerEntity getCustomerById(@Valid Integer id) throws Exception;

}
