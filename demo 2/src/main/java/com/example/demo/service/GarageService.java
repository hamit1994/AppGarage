package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Car;
import com.example.demo.repository.GarageRepository;

@Service
public class GarageService {

    @Autowired
    private GarageRepository garageRepository;

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        for (Car car : garageRepository.findAll()) {
            cars.add(car);
        }
        return cars;
    }
    
    public Car getCarById(long id) {
        return garageRepository.findById(id).orElse(null);
    }

    public void deleteCar(long id) {    
        garageRepository.deleteById(id);
    }

    public void addCar(Car car) {
        garageRepository.save(car);
    }

    public void updateCar(Car car, long id) {
        garageRepository.save(car);
    
    }
}
