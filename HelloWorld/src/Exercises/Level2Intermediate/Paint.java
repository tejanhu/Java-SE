package Exercises.Level2Intermediate;

public class Paint {

    String type;

    int volume = 0;

    double price = 0.0;

    int coverage = 0;

    double litres = 0.0;

    public Paint(double price, int coverage, double litres) {
        this.type = "Paint".toUpperCase();
        this.price = price;
        this.coverage = coverage;
        this.litres = litres;
    }

    public String getType() {
        return type;
    }

    public int getCoverage() {
        return coverage;
    }

    public double getPrice() {
        return price;
    }

    public double getLitres(){
        return litres;
    }

    public String toString(){
        return this.getType() + "";
    }


}
