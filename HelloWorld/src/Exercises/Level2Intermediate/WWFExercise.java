package Exercises.Level2Intermediate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WWFExercise {

    public static void writePersontoFile(ArrayList<Individual> list) {
        BufferedWriter bw = null;
        FileWriter fw;
        try {
            String myContent = "";
            File f = new File("greatFile.txt");

                f.createNewFile();

            for (int i = 0; i < list.size(); i++) {
                myContent += "" + list.get(i);


            }

            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            bw.write(myContent);
            System.out.println("File written Successfully");

        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error in closing the BufferedWriter" + e);
            }
        }

    }


    public static void main(String[] args) {
        ArrayList<Individual> personList = new ArrayList<>();
        Individual person1 = new Individual("John Smith", "Chartered-Accountant", 31);
        Individual person2 = new Individual("Madeline Richardson", "Station Officer", 30);
        Individual person3 = new Individual("Jhonny Smith", "Accountant Trainee", 19);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        for (Individual p : personList) {
            System.out.println(p);
        }
        writePersontoFile(personList);
    }
}
