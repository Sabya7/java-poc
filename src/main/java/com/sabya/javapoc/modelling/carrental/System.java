package com.sabya.javapoc.modelling.carrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class System {
    public static void main(String[] args) {
        SpringApplication.run(System.class);
    }
}
