package com.rabobank.airport.service;

import com.rabobank.airport.entity.Airplane;

import java.util.List;

public interface AirplaneService {
    public List<Airplane> findAll();

    public Airplane findById(int id);

    public void save(Airplane airplane);

    public void deleteById(int id);

    //Todo
    //public void refill(int fuel);
}
