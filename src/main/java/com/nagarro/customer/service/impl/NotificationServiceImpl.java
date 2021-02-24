package com.nagarro.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.customer.domain.Notification;
import com.nagarro.customer.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

	private List<Notification> notificationList = new ArrayList<>();

	@Override
	public String addNotification(Notification notification) {
		notificationList.add(notification);
		return "notification added for customer with id " + notification.getCustomerId();
	}

}
