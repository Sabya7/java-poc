package com.sabya.javapoc.modelling.hotelreservation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel {
    @ManyToMany
    private List<Room> rooms;
    private LocalDateTime startDate;
    private int durationInDays;
    private BookingStatus status;
    @ManyToOne
    private Guest bookedBy;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
}
