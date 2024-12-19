public class Vehicle {
    private String brand;
    public int numWheels;
    public double maxSpeed;
    public int numPassengers;
    public Vehicle(String brand, int numWheels, double maxSpeed, int numPassengers){
        this.brand = brand;
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
        this.numPassengers = numPassengers;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }


}
