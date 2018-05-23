import java.util.Scanner;

public class GameRunner {


    public static void main(String[] args) {

        Player player1 = new Player(true);
        Compass c = new Compass(true, "WestNile");
        Watch deadCompass = new Compass(false, "NorthNile2000");
        player1.decide();


    }

}