package com.example.oneononedemotwo.controller;

import com.example.oneononedemotwo.entity.User;
import com.example.oneononedemotwo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping
  public User createUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @GetMapping("/{id}")
  public User getUser(@PathVariable("id") Long id) {
    return userService.getUserById(id);
  }

}
