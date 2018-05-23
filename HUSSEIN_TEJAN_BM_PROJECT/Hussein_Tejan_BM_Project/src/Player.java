import java.util.Scanner;

public class Player {
    boolean isAlive;
    int age;
    String fName;
    String familyName;
    String doB;
    String doD;
    int distance;
    int position[][];
    String steps;
    Scanner scanner = new Scanner(System.in);

    public Player(boolean isAlive) {
        this.isAlive = isAlive;
        this.fName = fName;
        this.familyName = familyName;
        this.doB = doB;
        this.distance = distance;
        this.position = position;
        this.steps = steps;
    }
/*   EXTRA FUNCTIONALITY:
    public boolean die() {
        return isAlive;
    }
*/

    public void survive(Compass c, boolean isAlive) {
        if (c.die()) {
            this.isAlive = false;
        }
        this.isAlive = true;
    }


    /*EXTRA FUNCTIONALITY:
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    */

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    /* EXTRA FUNCTIONALITY:
        public String getDoD() {
            return doD;
        }

        public void setDoD(String doD) {
            this.doD = doD;
        }
     */


    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void registerDetails() {
        System.out.println("ENTER YOUR FIRST NAME:");

        setfName(scanner.nextLine());
        System.out.println("ENTER YOUR FAMILY NAME:");
        setFamilyName(scanner.nextLine());
        System.out.println("");

    /*   EXTRA FUNCTIONALITY:
            System.out.println("ENTER YOUR AGE:");
        }
    */

    }

    public void decide() {
        registerDetails();

        String input = "";
        String quitKeyword[] = {"quit", "forfeit", "throw in the towel", "give up"};
        boolean freeWill = true;
        boolean playing = false;

        System.out.println("");
        System.out.println(getfName().toUpperCase() + " " + getFamilyName().toUpperCase() + " YOU ARE TRAVELLING IN THE SAHARA DESERT WITH NOTHING BUT A COMPASS, AND ONLY YOU CAN SAVE YOUR SOUL!");
        System.out.println("");
        System.out.println("WHEN YOU ARE READY, ENTER \"PLAY\"");
        input = scanner.nextLine();
        System.out.println("");
        int i = 0;

        String actions[] = {"look", "turn back", "go forward"};

        String directions[] = {"N", "S", "E", "W"};

        int distance = 0;

        /*
            User is given the choice if they wish to play the game or quit!
            If they play, they must find an exit
            Otherwise if they quit, they can no longer continue playing the game
         */

        while (freeWill) {
            if (input.equalsIgnoreCase("PLAY")) {
                System.out.println("LET THE GAMES BEGIN!");
                System.out.println("");
                freeWill = false;
                playing = true;
                while (playing) {
                    wonderInTheWildernessOfTheDesert(input, directions, actions, distance);
                }

            } else if (input.equalsIgnoreCase(quitKeyword[i])) {
                System.out.println("THOU ART VANQUISHUED FROM THY PLACE!");
                freeWill = false;
            }
            i++;
        }


    }

    public void wonderInTheWildernessOfTheDesert(String input, String[] directions, String actions[], int distance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WHERE DOES THY SOUL WISH TO GO?");
        input = scanner.nextLine();
        if (isAlive) {
            if (input.equals(directions[0])) {

                setDistance(1);
                System.out.println(getDistance() + "m");


            } else if (input.equals(directions[1])) {

                setDistance(2);
                System.out.println(getDistance() + "m");

            } else if (input.equals(directions[2])) {

                setDistance(3);
                System.out.println(getDistance() + "m");

            } else if (input.equals(directions[3])) {
                setDistance(4);
                System.out.println(getDistance() + "m");

            } else {
                System.out.println("THOU ART BROKEN!");
            }
        } else {
            System.out.println(getfName() + " " + getFamilyName() + " DIED " + "A BRAVE DEATH!");
            System.exit(0);

        }

    }

    /*
        findRiver() - intended functionality to enable player to find the riverbanks
     */

    public void findRiverBanks() {

    }


}
