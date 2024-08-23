package com.sabya.javapoc.modelling.booking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    private LocalDateTime startTime;
    private LocalDateTime endTIme;
    @ManyToOne
    private Audi audi;
    @OneToMany
    private List<ShowSeat> showSeats;

}
