package com.vicky.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vicky.entity.Purchase;


public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
