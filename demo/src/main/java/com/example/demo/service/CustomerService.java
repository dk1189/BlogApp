package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public class CustomerService {
	
	private List<Customer> customers = new ArrayList<>(Arrays.asList(
			new Customer("0", "123","Company_123", "123", "500"),
			new Customer("1", "456", "Company_456", "456", "600")
			));
	
	public List<Customer> getAllCustomers(){
		return customers;
	}
	
	public Customer getCustomer(String id) {
		return customers.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
		
	}

}
