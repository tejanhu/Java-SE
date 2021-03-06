package Exercises.Level1Basic;

public class IterationlExercise {
    public static int getSum(int currentAge, int incrementValue, boolean flag){
        int sum=0;
        if(flag){
            sum = currentAge + incrementValue;
        }
        else if(currentAge ==0) {
            sum = incrementValue;
        }
        else if(incrementValue == 0){
            sum = currentAge;
        }
        else{
            sum =  currentAge * incrementValue;
        }

        return sum;

    }

    public static void printSum(int currentAge, int incrementValue, boolean flag){
        for (int i = 0; i <=10 ; i++) {
            System.out.println(getSum(currentAge, incrementValue, flag));
        }
    }

    public static void main(String[] args) {
        int currentAge = 22;
        int incrementValue = 0;
        boolean flag = false;
        System.out.println(getSum(currentAge, incrementValue, flag));
        printSum(currentAge, incrementValue, flag);

    }
}
