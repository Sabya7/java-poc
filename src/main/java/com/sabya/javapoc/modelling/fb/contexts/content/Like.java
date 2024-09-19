package com.sabya.javapoc.modelling.fb.contexts.content;

import com.sabya.javapoc.modelling.fb.contexts.user.Member;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Comment comment;
}
