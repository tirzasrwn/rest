package com.tirzasrwn.springboot.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @Value("${user.name}")
  private String userName;

  @GetMapping("/")
  public String sayHello() {
    return "Hello, world";
  }

  @GetMapping("/whoami")
  public String whoAmI() {
    return userName;
  }
}
