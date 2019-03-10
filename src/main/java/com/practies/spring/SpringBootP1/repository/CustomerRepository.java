package com.practies.spring.SpringBootP1.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practies.spring.SpringBootP1.models.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

	public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
