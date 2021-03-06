package com.paularolim.springorders.resources;

import com.paularolim.springorders.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Paula", "paula@email.com", "11999999999", "secret");

        return ResponseEntity.ok().body(user);
    }
}
