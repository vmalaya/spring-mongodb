package com.example.springmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {

  public Customer findByFirstName(String firstName);
  public List<Customer> findByLastName(String lastName);
}
