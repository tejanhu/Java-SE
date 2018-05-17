package Exercises.Level2Intermediate;

public class PaintWizardMain {
    public static void main(String[] args) {
        CheapoMax p = new CheapoMax();
        AverageJoes p2 = new AverageJoes();
        DuluxourousPaints p3 = new DuluxourousPaints();
        PaintWizard pw = new PaintWizard(p,p2,p3);
        System.out.println("The Cheapest Paint:");
        pw.calculateCheapest(p,p2,p3);
        System.out.println(pw.findLeastThatWastes(p,p2,p3));
    }
}
