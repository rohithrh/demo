package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.repository.ShowroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ShowroomService {

    @Autowired
    ShowroomRepository repository;
    public String addCar(Car car){
        Optional<Car> optionalCar =
                repository.findById(car.getId());
        if (optionalCar.isPresent())
            return "Car already present";
        repository.save(car);
        return "Added car succussfully";
    }
    public List<Car> getAllCars(){
        return repository.findAll();
    }

}
