package com.geektech.continents.model;

public class Continents {

    private String name;
    private int id;

    public Continents(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

