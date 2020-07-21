package com.example.springmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class CustomerRepositoryTest {

  @Autowired
  private CustomerRepository customerRepository;

  @Test
  void should_find() {
    List<Customer> all = customerRepository.findAll();
    System.out.println(all);
  }
}
