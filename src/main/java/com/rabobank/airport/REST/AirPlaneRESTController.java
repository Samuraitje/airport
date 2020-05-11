package com.rabobank.airport.REST;

import com.rabobank.airport.service.AirplaneService;
import com.rabobank.airport.entity.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AirPlaneRESTController {
    private AirplaneService airplaneService;

    @Autowired
    public AirPlaneRESTController(AirplaneService airplaneService){
        this.airplaneService = airplaneService;
    }

    @GetMapping("/airplanes")
    public List<Airplane> findAll(){
        return airplaneService.findAll();
    }

    @GetMapping("/airplanes/{ID}")
    public Airplane getAirplane(@PathVariable int ID){
        Airplane airplane = airplaneService.findById(ID);

        if (airplane == null) {
            throw new RuntimeException("Airplane: " + ID + " not found");
        }

        return airplane;
    }

    @PostMapping("/airplanes")
    public Airplane createAirplane(@RequestBody Airplane airplane){
        airplane.setId(0);
        airplaneService.save(airplane);
        return airplane;
    }

    @PutMapping("/airplanes")
    public Airplane changeAirplane(@RequestBody Airplane airplane){
        airplaneService.save(airplane);
        return airplane;
    }

    @DeleteMapping("/airplanes/{ID}")
    public String removeAirplane(@PathVariable int ID){
        Airplane airplane = airplaneService.findById(ID);

        if (airplane == null){
            throw new RuntimeException("Airplane: " + ID + " has not been found.");
        }

        airplaneService.deleteById(ID);
        return "Airplane: " + ID + " has been deleted.";
    }

}
