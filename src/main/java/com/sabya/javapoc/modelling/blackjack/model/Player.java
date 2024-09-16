package com.sabya.javapoc.modelling.blackjack.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double balance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hand_id")
    private Hand hand;

    public Player() {}

    public Player(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.hand = new Hand();
    }


    public void placeBet(double amount) {
        balance -= amount;
    }
}