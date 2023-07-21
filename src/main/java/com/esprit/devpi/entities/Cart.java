package com.esprit.devpi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String item;

    private Double total;

    private Double price;

    @OneToOne(mappedBy = "cart")
    private CustomUser customUser;

    @ManyToOne
    private Command command;

    @OneToOne(mappedBy = "cart")
    private Quantity quantity;

    // Getters and setters
}

