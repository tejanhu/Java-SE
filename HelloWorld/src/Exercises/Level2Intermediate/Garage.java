package Exercises.Level2Intermediate;

import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicle> vehicle = new ArrayList();

    public Garage() {

    }

    public double getBill() {
        double bill = 0.0;
        for (int i = 0; i < vehicle.size(); i++) {
            if (vehicle.get(i).type == "Vehicle") {
                bill += 200.00;
            } else if (vehicle.get(i).type == "Car") {
                bill += 200.00;
            } else if (vehicle.get(i).type == "Coach") {
                bill += 300.00;
            } else if (vehicle.get(i).type == "Motorcycle") {
                bill += 145.00;
            }
        }
        return bill;
    }

    public void addVehicle(Vehicle v) {
        vehicle.add(v);
    }

    public void removeVehicle(Vehicle v, String ID, String type) {
        for (int i = 0; i < vehicle.size(); i++) {
            if (vehicle.get(i).getID() == ID || vehicle.get(i).type == type) {
                vehicle.remove(v);
            }
        }
    }

    public void emptyGarage() {
        vehicle = new ArrayList<>();
    }


    public static void main(String[] args) {
        Garage g = new Garage();

        Vehicle randomVehicle = new Vehicle(20, 4, "1201347A");

        Vehicle randomCar = new Car(20, 4, "1201347A", "12/12/2012");

        Vehicle randomMotorcycle = new Motorcycle(20, 4, "1204215C", 125.00);

        Vehicle randomCoach = new Coach(20, 4, "1202594E", 400);

        g.addVehicle(randomVehicle);

        System.out.println("ADDED RANDOM VEHICLE");

        g.addVehicle(randomCar);

        System.out.println("ADDED RANDOM CAR");

        g.addVehicle(randomCoach);

        System.out.println("ADDED RANDOM COACH");

        g.addVehicle(randomMotorcycle);

        System.out.println("ADDED RANDOM MOTORCYCLE");

        System.out.println("TOTAL BILL : "+"\n"+g.getBill());

        g.removeVehicle(randomCar, "1201347A", "Car");

        System.out.println("REMOVED RANDOM CAR");

        System.out.println("TOTAL BILL : "+"\n"+g.getBill());

        g.emptyGarage();

        System.out.println("EMPTIED");

        System.out.println("TOTAL BILL :"+"\n "+g.getBill());
    }


}
