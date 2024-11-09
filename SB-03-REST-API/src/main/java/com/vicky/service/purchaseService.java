package com.vicky.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.entity.Purchase;
import com.vicky.repos.PurchaseRepository;

@Service
public class purchaseService {
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	public Purchase addPurchase(Purchase purchase ) {
		
		return purchaseRepository.save(purchase);
	}
	
	public Purchase getPurchase(Integer id) {
		
		Optional<Purchase>  optionalpurchase =  purchaseRepository.findById(id);
		Purchase p = optionalpurchase.get();
		System.out.println(p);
		return p;
	}
}
