package com.example.springmongodb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {
  @Id
  public int id;

  public String firstName;
  public String lastName;
}
