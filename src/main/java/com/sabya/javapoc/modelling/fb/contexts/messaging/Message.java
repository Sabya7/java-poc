package com.sabya.javapoc.modelling.fb.contexts.messaging;

import com.sabya.javapoc.modelling.fb.contexts.user.Member;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private LocalDateTime timeStamp;

    @ManyToOne
    private Member sender;

    @ManyToOne
    private Member receiver;
}
