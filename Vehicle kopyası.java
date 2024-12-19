package org.example;

public abstract class Vehicle implements Movable {
    private String brand;
    private int modelYear;

    public Vehicle(String brand, int modelYear) {
        this.brand = brand;
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public abstract double fuelConsumption(int distance);

    public abstract double lossInValue();
}
