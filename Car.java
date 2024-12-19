public class Car extends Vehicle {
    private String bodyType;
    private int engineType;
    private int numCylinders;
    private boolean frontBasket;


    public Car(String bodyType, int engineType, int numCylinders, String brand, int numWheels, double maxSpeed, int numPassengers) {
        super(brand, numWheels, maxSpeed, numPassengers);
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.numCylinders = numCylinders;
        this.frontBasket = frontBasket;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getEngineType() {
        return engineType;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setEngineType(int engineType) {
        this.engineType = engineType;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public void setFrontBasket(boolean frontBasket) {
        this.frontBasket = frontBasket;
    }

    public boolean isFrontBasket() {
        return frontBasket;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "\nNumber of wheels: " + numWheels +
                "\nMax. speed: " + maxSpeed +
                "\nNumber of passenger: " + numPassengers +
                "\nEngine type: " + engineTypeToString() +
                "\nNumber of cylinders: " + numCylinders +
                "\nBody type: " + bodyType;
    }

    private String engineTypeToString() {

        switch (engineType) {
            case 1 -> {
                return "Gasoline";
            }
            case 2 -> {
                return "Diesel";
            }
            case 3 -> {
                return "LPG";
            }
            case 4 -> {
                return "Electric";
            }
        }

        return null;
    }
}
