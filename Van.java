package org.example;

import java.util.Calendar;
public class Van extends HeavyVehicle {


    public Van(String brand, int modelYear) {
        super(brand, modelYear);
    }

    @Override
    public void move() {
        System.out.println(getBrand()+" is moving.");
    }

    @Override
    public double fuelConsumption(int distance) {
        return distance * 2;
    }

    @Override
    public double lossInValue() {
        return (Calendar.getInstance().get(Calendar.YEAR) - this.getModelYear()) * 500;
    }

}