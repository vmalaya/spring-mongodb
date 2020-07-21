package com.example.springmongodb.changelogs;

import com.example.springmongodb.Customer;
import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import org.springframework.data.mongodb.core.MongoTemplate;

@ChangeLog
public class DatabaseChangelog {

  @ChangeSet(order = "001", id = "insert", author = "valmel")
  public void insert(MongoTemplate mongoTemplate) {
    Customer customer = new Customer(1, "Boby", "Mellot");
    mongoTemplate.save(customer);
  }
}
