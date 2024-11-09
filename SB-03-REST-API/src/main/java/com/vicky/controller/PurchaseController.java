package com.vicky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.entity.Purchase;
import com.vicky.service.purchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	
	@Autowired
	private purchaseService purchaseService;
	
	@PostMapping("/add")
	public Purchase addPurchase(@RequestBody Purchase purchase ) {
		
		return purchaseService.addPurchase(purchase);
		
	}
	
	@GetMapping("/get/{id}")
	public Purchase getPurchase(@PathVariable("id") Integer id) {
		return purchaseService.getPurchase(id);
	}
	
	@GetMapping("/get1")
	public Purchase getPurchase1(@RequestParam("id") Integer id,@RequestParam("id1") Integer id1) {
		return purchaseService.getPurchase(id);
	}
	
	@GetMapping("/hello")
	public String name() {
		
		return "Hello Buddy";
		
	}
	

	
	
}
