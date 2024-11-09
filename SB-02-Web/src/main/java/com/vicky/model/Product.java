package com.vicky.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
	
	private int productId;
	private String productName;

}
