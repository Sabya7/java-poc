package com.sabya.javapoc.modelling.parkinglot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ParkingLotDriver {
    public static void main(String[] args) {
        SpringApplication.run(ParkingLotDriver.class);
    }
}
