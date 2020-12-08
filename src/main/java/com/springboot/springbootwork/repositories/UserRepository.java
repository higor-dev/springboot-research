package com.springboot.springbootwork.repositories;

import com.springboot.springbootwork.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
