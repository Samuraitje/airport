package com.rabobank.airport.service;

import com.rabobank.airport.dao.AirplaneRepository;
import com.rabobank.airport.entity.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneServiceImpl implements AirplaneService {

    private AirplaneRepository airplaneRepository;

    @Autowired
    public AirplaneServiceImpl(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    @Override
    public List<Airplane> findAll(){
        return airplaneRepository.findAll();
    };

    @Override
    public Airplane findById(int id){
        Optional<Airplane> result = airplaneRepository.findById(id);
        Airplane airplane = null;

        if (result.isPresent()){
            airplane = result.get();
        }
        return airplane;

    };

    @Override
    public void save(Airplane airplane){
        airplaneRepository.save(airplane);
    }

    @Override
    public void deleteById(int id){
        airplaneRepository.deleteById(id);
    }

}
