package com.example.springmongodb;

import com.github.mongobee.Mongobee;
import org.springframework.context.annotation.Bean;

public class Migration {

  @Bean
  public Mongobee mongobee(){
    Mongobee runner = new Mongobee("mongodb://localhost:27017/testdb");
    runner.setDbName("testdb");         // host must be set if not set in URI
    runner.setChangeLogsScanPackage("com.example.springmongodb.changelogs");

    return runner;
  }
}
