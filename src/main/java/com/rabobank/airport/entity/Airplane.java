package com.rabobank.airport.entity;

import javax.persistence.*;

@Entity
@Table(name="airplanes")
public class Airplane {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="airplane_id", unique = true, nullable = false)
    private int id;

    @Column(name="airline", nullable = false)
    private String airline;

    @Column(name="max_fuel", nullable = false)
    private final int maxFuel = 5;

    @Column(name="current_fuel", nullable = false)
    private int currentFuel;

    @Column(name="airport", nullable = false)
    private String airport;

    public Airplane(){}

    public Airplane(String airline, int currentFuel, String airport) {
        this.airline = airline;
        this.currentFuel = currentFuel;
        this.airport = airport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    @Override
    public String toString(){
        return "Airplane: \n" + "" +
                "*ID: " + this.id + "\n" +
                "*Airline: " + this.airline + "\n" +
                "*Max Fuel: " + this.maxFuel + "\n" +
                "*Current Fuel: " + this.currentFuel + "\n" +
                "*Airport: " + this.airport + "\n";
    }

}
