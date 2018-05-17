package Exercises.Level1Basic;

public class IterationArraysExercise1 {


    public static void getValues(int [] numbersCollection){

        for (int i = 0; i < numbersCollection.length; i++) {
            System.out.println(numbersCollection[i]);
        }

    }

    public static void main(String[] args) {
        int numbersCollection [] = new int [10];

        numbersCollection[0] = 1;
        numbersCollection[1] = 2;
        numbersCollection[2] = 3;
        numbersCollection[3] = 4;
        numbersCollection[4] = 5;
        numbersCollection[5] = 6;
        numbersCollection[6] = 7;
        numbersCollection[7] = 8;
        numbersCollection[8] = 9;
        numbersCollection[9] = 10;


       getValues(numbersCollection);
    }
}
