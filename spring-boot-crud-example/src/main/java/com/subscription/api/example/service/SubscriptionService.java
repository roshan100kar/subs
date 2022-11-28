package com.subscription.api.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subscription.api.example.entity.Subscription;
import com.subscription.api.example.repository.SubscriptionRepository;

@Service
public class SubscriptionService {
	
	@Autowired
	private SubscriptionRepository repository;
	
	public Subscription saveSubscription(Subscription subscription) {
		return repository.save(subscription);
	}
	
	public List<Subscription> saveSubscriptions(List<Subscription> subscriptions) {
		return repository.saveAll(subscriptions);
	}
	
	public List<Subscription> getSubscriptions() {
		return repository.findAll();
	}
	
	public Subscription getSubscriptionById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Subscription getSubscriptionByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteSubscription(int id) {
		repository.deleteById(id);
		return "subscription removed" + id;
	}
	
	public Subscription updateSubscription(Subscription subscription) {
		Subscription existingSubscription = repository.findById(subscription.getId()).orElse(null);
		existingSubscription.setName(subscription.getName());
		existingSubscription.setSubdate(subscription.getSubdate());
		existingSubscription.setSubdesc(subscription.getSubdesc());
		return repository.save(existingSubscription);
		
		
		
		
	}

}
