public class Bicycle extends Vehicle{
    private boolean frontBasket;
    private int engineType;
    private int numCylinders;

    public Bicycle(boolean frontBasket,String brand,int numWheels,double maxSpeed,int numPassengers){
        super(brand,numWheels,maxSpeed,numPassengers);
        this.frontBasket=frontBasket;

    }

    public boolean isFrontBasket() {
        return frontBasket;
    }

    public void setFrontBasket(boolean frontBasket) {
        this.frontBasket = frontBasket;
    }


    public int getEngineType() {
        return engineType;
    }
    public int getNumCylinders(){
        return numCylinders;
    }

    @Override
    public String toString() {
        return "Bicycle:\n" +
                "Brand: " + getBrand() + "\n" +
                "Number of wheels: " + getNumWheels() + "\n" +
                "Max. speed: " + getMaxSpeed() + "\n" +
                "Number of passenger: " + getNumPassengers() + "\n" +
                "Engine type: " + getEngineType() + "\n" +
                "Number of cylinders: " + getNumCylinders() + "\n" +
                "Front basket: " + (frontBasket ? "Yes" : "No") + "\n";
    }

}
