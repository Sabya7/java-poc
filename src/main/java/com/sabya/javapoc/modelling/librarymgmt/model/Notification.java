package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Notification extends BaseModel {
    private String notificationType;
    private String notificationRefId;
    @ManyToOne
    private BooKLending booKLending;
    @ManyToOne
    private Fine fine;
}
