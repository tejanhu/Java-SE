package Exercises.Level2Intermediate;

public class Vehicle {

    int engineSize = 0;
    int numberOfWheels = 0;
    String ID="";
    String type="";

    public Vehicle(int engineSize, int numberOfWheels, String ID) {
        this.engineSize = engineSize;
        this.numberOfWheels = numberOfWheels;
        this.ID = ID;
        this.type = "Vehicle";
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


}
