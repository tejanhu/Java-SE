package Exercises.Level2Intermediate;

public class Motorcycle extends Vehicle {
    double mileage =0.0;

    public Motorcycle(int engineSize, int numberOfWheels, String ID, double mileage){
        super(0,0,"");
        this.type = "Motorcycle";
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }


}
