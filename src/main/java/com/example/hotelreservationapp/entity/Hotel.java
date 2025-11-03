package com.example.hotelreservationapp.entity;

import jakarta.persistence.*;

import java.util.List;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private int etoiles;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Chambre> chambres;
}
