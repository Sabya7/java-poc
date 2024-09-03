package com.sabya.javapoc.modelling.restaurant.model;

import jakarta.persistence.*;

@Entity
public class TableSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int seatNumber;

    @ManyToOne
    @JoinColumn
    private RestaurantTable restaurantTable;

}