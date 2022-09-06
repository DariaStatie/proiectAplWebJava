package com.example.proiectAplWebJava.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int directorId;
    private String directorName;
    private String email;

}
