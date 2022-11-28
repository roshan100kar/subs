package com.subscription.api.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subscription.api.example.entity.Subscription;
import com.subscription.api.example.service.SubscriptionService;

@RestController
public class SubscriptionController {
	
	@Autowired
	private SubscriptionService service;
	
	
	@PostMapping("/addsub")
	public Subscription addSubscription(@RequestBody Subscription subscription) {
		return service.saveSubscription(subscription);
	}
	
	@PostMapping("/addsubs")
	public List<Subscription> addSubscriptions(@RequestBody List<Subscription> subscriptions) {
		return service.saveSubscriptions(subscriptions);
	}
	
	
	@GetMapping("/subs")
	public List<Subscription> findAllSubscription() {
		return service.getSubscriptions();
	}
	
	@GetMapping("/sub/{id}")
	public Subscription findSubscriptionById(@PathVariable int id) {
		return service.getSubscriptionById(id);
		
	}
	
	
	@GetMapping("/sub/{name}")
	public Subscription findSubscriptionByName(@PathVariable String name) {
		return service.getSubscriptionByName(name);
		
	}
	
	@PutMapping("/update")
	public Subscription updateSubscription(@RequestBody Subscription subscription) {
		return service.updateSubscription(subscription);
		
	}
	
	@DeleteMapping
	public String updateSubscription(@PathVariable int id) {
		return service.deleteSubscription(id);
		
	}
	
	
	
	

}
