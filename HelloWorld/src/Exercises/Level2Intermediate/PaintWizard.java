package Exercises.Level2Intermediate;

public class PaintWizard {

    Paint p;
    double roomSize = 500.0;

    public PaintWizard(Paint p, Paint p2, Paint p3) {
        this.roomSize = roomSize;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public void calculateCheapest(Paint p1, Paint p2, Paint p3) {
        Paint p = new Paint(0.0, 0, 0.0);
        if (p1.getPrice() < p2.getPrice() && p1.getPrice() < p3.getPrice()) {
            p = p1;
        } else if (p2.getPrice() < p1.getPrice() && p2.getPrice() < p3.getPrice()) {
            p = p2;
        } else if (p3.getPrice() < p1.getPrice() && p3.getPrice() < p2.getPrice()) {
            p = p3;
        }
        System.out.println(p);
        System.out.println("");
    }

    public Paint findLeastThatWastes(CheapoMax p1, AverageJoes p3, DuluxourousPaints p2) {

        Paint p = new Paint(0.0,0,0.0);

        double amountOfCheapoTinsNeeded = 0.0;

        double remainingFractionOfCheapoTins = 0.0;

        double cheapoMaxlitresWasted = 0.0;

        double leastLitresWasted = 0.0;

        amountOfCheapoTinsNeeded = this.roomSize / p1.getCoverage();

        System.out.println("amountOfCheapoTinsNeeded: "+amountOfCheapoTinsNeeded);

        remainingFractionOfCheapoTins = (Math.ceil(amountOfCheapoTinsNeeded)) - amountOfCheapoTinsNeeded;

        System.out.println("remainingFractionOfCheapoTins: "+remainingFractionOfCheapoTins);

        cheapoMaxlitresWasted = p1.getLitres() * remainingFractionOfCheapoTins;

        System.out.println("cheapoMaxlitresWasted: "+cheapoMaxlitresWasted);

        System.out.println();

        double amountOfDuluxourousTinsNeeded = 0.0;

        double remainingFractionOfDuluxourousTins = 0.0;

        double duluxourousLitresWasted = 0.0;

        amountOfDuluxourousTinsNeeded = this.roomSize / p2.getCoverage();

        System.out.println("amountOfDuluxourousTinsNeeded: "+amountOfDuluxourousTinsNeeded);

        remainingFractionOfDuluxourousTins = (Math.ceil(amountOfDuluxourousTinsNeeded)) - amountOfDuluxourousTinsNeeded;

        System.out.println("remainingFractionOfDuluxourousTins: "+remainingFractionOfCheapoTins);

        duluxourousLitresWasted = p2.getLitres() * remainingFractionOfDuluxourousTins;

        System.out.println("duluxourousLitresWasted: "+duluxourousLitresWasted);

        System.out.println();

        double amountOfAverageTinsNeeded = 0.0;

        double remainingFractionOfAverageTins = 0.0;

        double averageLitresWasted = 0.0;

        amountOfAverageTinsNeeded = this.roomSize / p3.getCoverage();

        System.out.println("amountOfAverageTinsNeeded: "+amountOfAverageTinsNeeded);

        remainingFractionOfAverageTins = (Math.ceil(amountOfAverageTinsNeeded)) - amountOfAverageTinsNeeded;

        System.out.println("remainingFractionOfAverageTins: "+remainingFractionOfAverageTins);

        averageLitresWasted = p3.getLitres() * remainingFractionOfAverageTins;

        System.out.println("averageLitresWasted: "+averageLitresWasted);

        if (cheapoMaxlitresWasted < duluxourousLitresWasted && cheapoMaxlitresWasted < averageLitresWasted) {
            leastLitresWasted = cheapoMaxlitresWasted;
            p = p1;
        } else if (duluxourousLitresWasted < cheapoMaxlitresWasted && duluxourousLitresWasted < averageLitresWasted) {
            leastLitresWasted = cheapoMaxlitresWasted;
            p = p2;
        } else if (averageLitresWasted < cheapoMaxlitresWasted && averageLitresWasted < duluxourousLitresWasted) {
            leastLitresWasted = averageLitresWasted;
            p = p3;
        } else {
            leastLitresWasted = -1;
        }
        System.out.println("");
        System.out.println("The Paint that wastes the least:");
       return p;

    }


}

