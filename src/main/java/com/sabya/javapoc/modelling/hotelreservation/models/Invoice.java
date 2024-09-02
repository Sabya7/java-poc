package com.sabya.javapoc.modelling.hotelreservation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Invoice extends BaseModel {
    private long invoiceNumber;
    @OneToOne
    private Booking booking;
}
