package com.sparta.jpaadvanced.repository;

import com.sparta.jpaadvanced.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
