package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Car;

@Service
public class GarageService {

    static private ArrayList<Car> cars = new ArrayList<Car>(Arrays.asList(
        new Car(1, "Laguna", "Sedan", 2019, Car.Color.BLACK),
        new Car(2, "5008", "Peugeot", 2021, Car.Color.RED),
        new Car(3, "208", "Peugeot", 2004, Car.Color.GREEN),
        new Car(4, "C4", "Citrouen", 2008, Car.Color.YELLOW)
    ));

    public List<Car> getCars() {
        return cars;
    }
    
    public Car getCarById(long id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    public void deleteCar(long id) {    
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                cars.remove(i);
                break;
            }
        }
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void updateCar(Car car, long id) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                cars.set(i, car);
                break;
            }
        }
    }
}
