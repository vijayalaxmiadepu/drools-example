package com.aws.sns.controller;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.sns.dto.Order;
import com.aws.sns.dto.OrderDetails;

@RestController
public class DiscountController {
	
	@Autowired
	private KieContainer kieContainer;

	/*@PostMapping("/orderNow")
	public Order orderNow(@RequestBody Order orderDetails) {
		KieSession kieSession = kieContainer.newKieSession();
		System.out.println("Session is created " +kieSession.getIdentifier());
		kieSession.insert(orderDetails);
		kieSession.fireAllRules();
		kieSession.dispose();
		return orderDetails;
	}*/
	
	@PostMapping("/orderNow")
	public OrderDetails orderNow(@RequestBody OrderDetails orderDetails) {
		KieSession kieSession = kieContainer.newKieSession();
		System.out.println("Session is created " +kieSession.getIdentifier());
		kieSession.insert(orderDetails);
		kieSession.fireAllRules();
		kieSession.dispose();
		return orderDetails;
	}
}
