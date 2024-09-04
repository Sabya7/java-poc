package com.sabya.javapoc.modelling.shopping.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDetails {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

}