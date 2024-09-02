package com.sabya.javapoc.modelling.hotelreservation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Room extends BaseModel {
    private int roomNumber;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
}