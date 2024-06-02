package com.programming.siva.springbatchjob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.siva.springbatchjob.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>	{

}
