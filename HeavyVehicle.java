package org.example;

public abstract class HeavyVehicle extends Vehicle {
    private final String brand;
    private final int modelYear;

    public HeavyVehicle(String brand, int modelYear) {
        super(brand, modelYear);
        this.brand = brand;
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }


    public int getModelYear() {
        return modelYear;
    }


    public abstract void move();

    public abstract double fuelConsumption(int distance);

    public abstract double lossInValue();
}

