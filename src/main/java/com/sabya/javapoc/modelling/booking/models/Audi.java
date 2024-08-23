package com.sabya.javapoc.modelling.booking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Audi {
    @Id
    @Column(name = "audi_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int audi_id;
    @CreatedDate
    private ZonedDateTime createdAt;
    @LastModifiedDate
    private ZonedDateTime modifiedAt;
    private String name;
    @OneToMany
    private List<Seat> seats;
    private int capacity;
    @ManyToOne
    private Theatre theatre;
}
