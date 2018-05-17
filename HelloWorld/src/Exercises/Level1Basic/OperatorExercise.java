package Exercises.Level1Basic;

public class OperatorExercise {
    public static int getSum(int currentAge, int incrementValue){
        int sum = currentAge + incrementValue;
        return sum;
    }
    public static void main(String[] args) {
       int currentAge = 22;
       int incrementValue = 1;
        System.out.println(getSum(currentAge, incrementValue));
    }
}
