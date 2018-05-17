package Exercises.Level2Intermediate;

public class BlackJackExercise {

    public static int getValue(int n, int m) {
        int value = 0;
        if (n < 21 && m < 21) {
            if(n>m){
                value = n;
                return value;
            }
            else if(m>n){
                value = m;
                return value;
            }
        }
        return value;

    }

    public static void main(String[] args) {
        int n = 19;
        int m = 20;
        System.out.println(getValue(n, m));
    }
}
