package com.sabya.javapoc.modelling.booking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private User bookedBy;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> showSeats;
    private double amount;
    @Enumerated(EnumType.STRING)
    private TicketStatus status;
}
