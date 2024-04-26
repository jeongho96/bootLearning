package com.sparta.jpaadvanced.repository;

import com.sparta.jpaadvanced.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
