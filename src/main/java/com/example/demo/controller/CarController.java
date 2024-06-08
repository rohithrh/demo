package com.example.demo.controller;


import com.example.demo.model.Car;
import com.example.demo.service.ShowroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class CarController {

    @Autowired
    ShowroomService service;

    @GetMapping(value = "/allcars")
    public List<Car> getAllCars() {
//        return new ArrayList<>();
        return service.getAllCars();
    }

    @PostMapping(value = "/addcar")
    public String addCar(@RequestBody Car car){
        return service.addCar(car);
    }


}
