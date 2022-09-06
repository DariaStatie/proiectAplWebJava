package com.example.proiectAplWebJava.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;

    @NotNull(message = "Title must not be null!")
    @NotEmpty(message = "Title must not be empty!")
    private String title;

    @OneToOne
    @JoinColumn(name="category_id")
    private Category category;

    private String plot;
    @Max(value = 2022, message = "Year can not be bigger than 2022")
    private Integer year;

    @OneToMany(mappedBy = "movie")
    //@JsonIgnore
    private List<Review> reviews = new ArrayList<>();

    public Movie(@NotNull(message = "Title must not be null!")@NotEmpty(message = "Title cannot be empty!") String title){
        this.title = title;
    }

}
