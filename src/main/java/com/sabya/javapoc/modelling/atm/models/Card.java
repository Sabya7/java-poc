package com.sabya.javapoc.modelling.atm.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    private String cardNumber;
    private String pin;
    private LocalDate expirationDate;

    public Card(String cardNumber, String pin, LocalDate expirationDate) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.expirationDate = expirationDate;
    }

    public boolean validatePin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }

}
