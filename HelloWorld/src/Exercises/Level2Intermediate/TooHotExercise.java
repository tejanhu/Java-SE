package Exercises.Level2Intermediate;

public class TooHotExercise {

    public static boolean getTemperatureValidation(int temp, boolean isSummer) {

        if ((temp >= 60) && (90 > temp) && isSummer) {
            return true;
        }
        else if((temp >= 60) && (90 > temp) && isSummer){
            return false;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        int temperature = 80;
        boolean isSummer = true;
        System.out.println(getTemperatureValidation(temperature, isSummer));
    }
}
