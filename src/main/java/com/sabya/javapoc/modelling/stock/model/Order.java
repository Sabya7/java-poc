package com.sabya.javapoc.modelling.stock.model;

import com.sabya.javapoc.modelling.shopping.models.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "order_type")
public abstract class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MemberAccount member;

    @ManyToOne
    private Stock stock;

    private Integer quantity;
    private BigDecimal price;

    private LocalDateTime orderDate;
    private OrderStatus status;

}
