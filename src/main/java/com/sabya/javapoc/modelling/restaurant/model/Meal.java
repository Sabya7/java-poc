package com.sabya.javapoc.modelling.restaurant.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "table_seat_id")
    private TableSeat tableSeat;

    @ManyToOne
    @JoinColumn
    private RestaurantOrder restaurantOrder;

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    private List<MealItem> mealItems;

}