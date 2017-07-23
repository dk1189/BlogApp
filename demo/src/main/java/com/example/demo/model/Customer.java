package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.Data;

@Data
public class Customer {

	@GeneratedValue
	String id;
	
	String customer_nbr;
	String customer_name;
	String customer_system;
	String customer_client;
	
	public Customer(String id, String customer_nbr, String customer_name, String customer_system,
			String customer_client) {
		super();
		this.id = id;
		this.customer_nbr = customer_nbr;
		this.customer_name = customer_name;
		this.customer_system = customer_system;
		this.customer_client = customer_client;
	}

	public Customer() {
	}

}
