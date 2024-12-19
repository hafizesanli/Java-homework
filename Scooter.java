public class Scooter extends Vehicle{
    private boolean seat;
    public Scooter(String brand,int numWheels,double maxSpeed,int numPassengers, boolean seat){
        super(brand,numWheels,maxSpeed,numPassengers);
        this.seat=seat;
    }

    public void setSeat(boolean seat) {
        this.seat = seat;
    }

    public boolean isSeat() {
        return seat;
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Brand: ").append(getBrand()).append("\n")
                .append("Number of wheels: ").append(getNumWheels()).append("\n")
                .append("Max. speed: ").append(getMaxSpeed()).append("\n")
                .append("Number of passenger: ").append(getMaxPassengers()).append("\n")
                .append("Passenger seat: ").append(isSeat() ? "Yes" : "No");
        return stringBuilder.toString();
    }

   private int getMaxPassengers() {
        return 0;
    }

}
