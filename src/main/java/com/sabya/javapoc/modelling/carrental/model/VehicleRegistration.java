package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class VehicleRegistration extends BaseModel {
    private long reservationNumber;
    private LocalDateTime dueDate;
    private LocalDateTime returnDate;
    private String pickupLocationName;
    private ReservationStatus status;
    private String returnLocationName;
    @ManyToOne
    private Member rentedBy;
}
