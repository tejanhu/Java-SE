package Exercises.Level1Basic;

public class ConditionalExercise1 {
    public static int getSum(int currentAge, int incrementValue, boolean flag){
        int sum =0;
        if(flag){
            sum = currentAge + incrementValue;
        }
        else{
            sum =  currentAge * incrementValue;
        }

        return sum;

    }
    public static void main(String[] args) {
        int currentAge = 22;
        int incrementValue = 1;
        boolean flag = false;
        System.out.println(getSum(currentAge, incrementValue, flag));
    }
}
