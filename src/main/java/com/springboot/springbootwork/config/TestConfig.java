package com.springboot.springbootwork.config;

import com.springboot.springbootwork.entities.User;
import com.springboot.springbootwork.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria","maria@ht","200000000","1234");
        User u2 = new User(null, "Alex", "alex@gm", "121123123", "123" );

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}