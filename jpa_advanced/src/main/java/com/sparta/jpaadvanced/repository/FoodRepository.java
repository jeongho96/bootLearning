package com.sparta.jpaadvanced.repository;

import com.sparta.jpaadvanced.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
