package com.geektech.continents.model;

public class Countries {

    private String name;
    private String city;
    private int flag;


    public Countries(String name, String city, int flag) {
        this.name = name;
        this.city = city;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getFlag() {
        return flag;
    }
}
