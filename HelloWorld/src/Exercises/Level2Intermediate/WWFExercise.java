package Exercises.Level2Intermediate;

import java.util.ArrayList;

public class WWFExercise {
    public static void main(String[] args) {
        ArrayList <Individual> personList = new ArrayList<>();
        Individual person1 = new Individual("John Smith", "Chartered-Accountant",31);
        Individual person2 = new Individual("Madeline Richardson", "Station Officer",30);
        Individual person3 = new Individual("Jhonny Smith", "Accountant Trainee",19);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
    }
}
