package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BookReservation extends BaseModel {
    @Enumerated(EnumType.STRING)
    private ReservationStatus reservationStatus;
    @ManyToOne
    private Account reservedBy;
    @OneToOne
    private BookItem bookItem;
}
