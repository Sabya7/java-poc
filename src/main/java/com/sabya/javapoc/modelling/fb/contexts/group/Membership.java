package com.sabya.javapoc.modelling.fb.contexts.group;

import com.sabya.javapoc.modelling.fb.contexts.user.Member;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Group group;

    private LocalDateTime joinedAt;
}
