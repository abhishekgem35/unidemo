package com.uniworkshop.demo.controller;

import com.uniworkshop.demo.entity.User;
import com.uniworkshop.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(produces = "application/json")
public class UserController {
    private final UserRepository repository;

    @GetMapping("/v1/users")
    public List<User> getAll() {
        return repository.findAll();
    }

    @PostMapping("/v1/user")
    public User create(@RequestBody User user) {
        return repository.save(user);
    }
}
