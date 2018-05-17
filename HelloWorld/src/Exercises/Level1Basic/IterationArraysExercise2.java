package Exercises.Level1Basic;

public class IterationArraysExercise2 {


    public static void getValues(int [] numbersCollection){

        for (int i = 0; i < numbersCollection.length; i++) {
            numbersCollection[i] = i;
        }

        for (int j = 0; j <numbersCollection.length ; j++) {
            System.out.println(numbersCollection[j]=j*10);
        }

    }

    public static void main(String[] args) {
        int numbersCollection [] = new int [10];

       getValues(numbersCollection);
    }
}
