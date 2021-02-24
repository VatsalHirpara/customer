package com.nagarro.customer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
	private Integer customerId;
	private String email;
	private String title;
	private String text;
}
