package com.programming.siva.springbatchjob.config;

import org.springframework.batch.item.ItemProcessor;

import com.programming.siva.springbatchjob.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		
		return customer;
	}

}
