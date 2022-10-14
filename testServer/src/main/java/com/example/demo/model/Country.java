package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Country {
    @Id
    private  int id;
    private String name;
    private int population;

    public static Country nameANDpopulation(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}
