package com.example.h2zoo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class amphibians {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private final String name;

    @Column
    private final String species;

    @Column
    private final String color;

    @Column
    private final String dietType;

    public amphibians(String name, String species, String color, String dietType){
        this.name = name;
        this.species = species;
        this.color = color;
        this.dietType = dietType;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public String getColor() {
        return color;
    }
    public String getDietType() {
        return dietType;
    }
}
