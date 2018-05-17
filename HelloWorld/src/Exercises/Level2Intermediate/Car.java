package Exercises.Level2Intermediate;

public class Car extends Vehicle {

    String purchaseDate = "";

    public Car(int engineSize, int numberOfWheels, String ID, String purchaseDate) {
        super(0, 0, "");
        this.type = "Car";
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


}
