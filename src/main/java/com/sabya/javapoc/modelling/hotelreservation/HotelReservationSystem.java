package com.sabya.javapoc.modelling.hotelreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HotelReservationSystem {
    public static void main(String[] args) {
        SpringApplication.run(HotelReservationSystem.class);
    }
}
