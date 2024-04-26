package com.sparta.myselectshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MySelectShopMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySelectShopMainApplication.class, args);
    }

}
