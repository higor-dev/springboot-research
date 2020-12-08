package com.springboot.springbootwork.resources;

import com.springboot.springbootwork.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Higor", "higor@hotmail.com", "2199999999", "123");
        return ResponseEntity.ok().body(u);
    }

}
