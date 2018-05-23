import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR AGE:");
        Scanner scan = new Scanner(System.in);
        Player person1 = new Player(true);
        person1.setAge(scan.nextInt());
        System.out.println("YOU ARE AGE: "+person1.getAge());







    }
}
