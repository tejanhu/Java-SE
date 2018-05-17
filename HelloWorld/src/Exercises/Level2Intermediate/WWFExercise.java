package Exercises.Level2Intermediate;

import java.io.*;
import java.util.ArrayList;

public class WWFExercise {

    public static void writePersontoFile(ArrayList<Individual> list) {
        BufferedWriter bw = null;
        FileWriter fw;
        try {
            String myContent = "";
            File f = new File("greatFile.txt");

                f.createNewFile();
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                //myContent += "" + list.get(i);
                bw.write(list.get(i).toString());
                bw.newLine();
            }



          //  bw.write(myContent);
          //  bw.newLine();
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

    public static ArrayList<String> populateList(){
        ArrayList<String> dataList = new ArrayList<>();
        String l = null;
        BufferedReader bReader = null;
        File f = new File("greatFile.txt");
        String content [];
        try {
            int i = 0;
            String str;
            bReader = new BufferedReader(new FileReader(f));
            while((l = bReader.readLine()) != null){
                str = "";
               content= l.split("  ");
               for(String s : content){
                   str += s;
               }
                dataList.add(str);
            }
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

            return dataList;
    }


    public static void main(String[] args) {
        ArrayList<Individual> personList = new ArrayList<>();
        Individual person1 = new Individual("John Smith", "Chartered-Accountant", 31);
        Individual person2 = new Individual("Madeline Richardson", "Station Officer", 30);
        Individual person3 = new Individual("Jhonny Smith", "Accountant Trainee", 19);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

//        for (Individual p : personList) {
//            System.out.println(p);
//        }
        writePersontoFile(personList);



        System.out.println(populateList());

    }
}
