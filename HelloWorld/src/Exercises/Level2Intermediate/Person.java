package Exercises.Level2Intermediate;


import java.util.ArrayList;

public class Person {

    public String name = "";

    public int age;

    public String jobTitle = "";

    Person(String name, int age, String jobTitle){
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public String toString(){
        return "Person's name is "+ getName() + "." + " Person's age is "+ getAge() + "." + " Person's job title is " + getJobTitle() + ".";
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Smith", 24,"Solutions Architect");
        Person person2 = new Person("Sam Netflix", 28,"Scrum Master");
        Person person3 = new Person("Jimmy Screwed", 26,"Exploratory Tester");

        ArrayList<Person> personsList = new ArrayList();
        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);

        for(Person p: personsList) {
            System.out.println(p);
        }

        System.out.println(searchName(personsList, "John Smith"));

    }

    public static String searchName(ArrayList<Person> personsArrayList, String name){
        String msg="";
        for (int i = 0; i < personsArrayList.size(); i++) {
            if(personsArrayList.get(i).getName().equals(name)){
                msg = name.toUpperCase() + " DOES EXIST!";
                break;
            }
            else{
                msg = name.toUpperCase() + " DOES NOT EXIST!";
            }
        }
        return msg;
    }
}
