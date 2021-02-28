package com.nagarro.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.customer.domain.CustomerEntity;
import com.nagarro.customer.dto.ResponseTO;
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
	public ResponseEntity<ResponseTO<List<CustomerEntity>>> getCustomers() {
		ResponseTO<List<CustomerEntity>> response = new ResponseTO<>();
		response.setData(customerService.getAllCustomers());
		return ResponseEntity.ok(response);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseTO<CustomerEntity>> getCustomerById(@PathVariable @Valid Integer id)
			throws Exception {
		ResponseTO<CustomerEntity> response = new ResponseTO<>();
		response.setData(customerService.getCustomerById(id));
		return ResponseEntity.ok(response);
	}
}
