package com.subscription.api.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subscription.api.example.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {

//	Subscription save(Subscription subscription);

	Subscription findByName(String name);

}
