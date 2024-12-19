public class VehicleDemo{
    public static void main(String[] args) {
        Vehicle[] vehicles= new Vehicle[5];

        Car car = new Car("Sedan",2,4,"Seat",4,250,6);
        car.setNumCylinders(4);
        vehicles[0]=car;

        Bicycle bicycle = new Bicycle(true,"Aprilla", 3, 15, 2);
        vehicles[1]=bicycle;

        Truck truck = new Truck(2,8,"Mercedes",12,140,3,5000);
        truck.setEngineType(2);
        vehicles[2]=truck;

        Car car2 = new Car("Wagon",3,4,"Bisan",4,20,1);
        car2.setFrontBasket(false);
        vehicles[3]=car2;

        Car car3 = new Car("Sedan",1,4,"Opel",4,190,4);
        car3.setNumCylinders(3);
        vehicles[4]=car3;

        for(int i=0; i< vehicles.length; i++){
            System.out.println("Vehicle #" + (i+1));
            System.out.println("Brand: " +vehicles[i].getBrand());
            System.out.println("Number of wheels: " +vehicles[i].getNumWheels());
            System.out.println("Max. speed: " +vehicles[i].getMaxSpeed());
            System.out.println("Number of passenger: " +vehicles[i].getNumPassengers());

            if(vehicles[i] instanceof Car){
                Car c = (Car) vehicles[i];
                System.out.println("Engine type: " + c.getEngineType());
                System.out.println("Number of cylinders: " + c.getNumCylinders());
                System.out.println("Body type: " + c.getBodyType());
            } else if (vehicles[i] instanceof Truck) {
                Truck t = (Truck) vehicles[i];
                System.out.println("Max tonnage: " + t.getMaxTonnage());
                System.out.println("Engine type: " + t.getEngineType());
                System.out.println("Number of cylinders: " + t.getNumCylinders());

            }else if (vehicles[i] instanceof Bicycle) {
                Bicycle b = (Bicycle) vehicles[i];
                System.out.println("Front basket: " + b.isFrontBasket());
            }else {
                Scooter s = (Scooter) vehicles[i];
                System.out.println("Passenger seat: " + s.isSeat());
            }
            System.out.println();
        }


    }

}
