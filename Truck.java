public class Truck extends Vehicle{
    private double maxTonnage;
    private int engineType;
    private int numCylinders;

    public Truck( int engineType, int numCylinders, String brand, int numWheels, double maxSpeed, int numPassengers, double maxTonnage){
        super(brand,numWheels,maxSpeed,numPassengers);
        this.maxTonnage=maxTonnage;
        this.engineType=engineType;
        this.numCylinders=numCylinders;
    }

    public double getMaxTonnage() {
        return maxTonnage;
    }

    public void setMaxTonnage(double maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public int getEngineType() {
        return engineType;
    }

    public void setEngineType(int engineType) {
        this.engineType = engineType;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }
    @Override
    public String toString(){
        return "Truck:\n" +
                "Brand: " + getBrand() + "\n"+
                "Number of wheels: " +getNumWheels()+ "\n"+
                "Max. speed: " + getMaxSpeed() + "\n" +
                "Number of passenger: " + getNumPassengers() + "\n" +
                "Engine type: " + getEngineType() + "\n" +
                "Number of cylinders: " + getNumCylinders() + "\n" +
                "Max tonnage: " + maxTonnage + "\n";
    }

}
