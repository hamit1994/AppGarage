package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
    public enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE, BLACK
    }
    @Id
    private long id;    
    private String model;
    private String brand;
    
    @Column(name = "release_year")
    private int year;
    private Color color;

    public Car() {
        super();
    }
    
    public Car(long id, String model, String brand, int year, Color color) {
        this.id = id;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public long getId() {
            return id;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", model=" + model + ", brand=" + brand + ", year=" + year + "]";
    }

    @Override
    public int hashCode() { return color.hashCode() + model.hashCode() + brand.hashCode() + year; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        Car other = (Car) obj;
        if (color!= other.color)
            return false;
        if (model == null) {
            if (other.model!= null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (brand == null) {
            if (other.brand!= null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (year!= other.year)
            return false;
        return true;
    }
}
