package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.User;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("api")
public class UserRestController {
	private List<User> users;
	{
		users= Arrays.asList(new User("Nisan", 26), new User("Mauricio",24));
	}
	
	@RequestMapping("users")
	public List<User> getAllUsers(){
		return users;
	}
	
	@RequestMapping("Hello")
	public String sayHi() {
		return "Hi";
	}
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("Customers")
	public List <Customer> getAllCustomers() 
	{
		return customerService.getAllCustomers();
	}
	@RequestMapping("Customer/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="Customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}

}
