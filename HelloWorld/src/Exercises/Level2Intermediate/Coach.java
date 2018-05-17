package Exercises.Level2Intermediate;

public class Coach extends Vehicle {

    int numberOfPassengers = 0;

    public Coach(int engineSize, int numberOfWheels, String ID, int numberOfPassengers){
        super(0,0,"");
        this.type = "Coach";
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


}
