package com.example.proiectAplWebJava.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Viewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int viewerId;
    private String username;
    private String email;

    @OneToMany(mappedBy = "viewer")
    //@JsonIgnore
    private List<Review> reviews = new ArrayList<>();
}
