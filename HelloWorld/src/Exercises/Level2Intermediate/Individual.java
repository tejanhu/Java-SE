package Exercises.Level2Intermediate;

public class Individual {

    private String name;
    private String occupation;
    private int age;

    public Individual(String n, String o, int a) {
        n = name;
        o = occupation;
        a = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
