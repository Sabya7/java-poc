package com.sabya.javapoc.modelling.booking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private int seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @ManyToOne
    @JoinColumn(name = "audi_id")
    private Audi audi;
}
