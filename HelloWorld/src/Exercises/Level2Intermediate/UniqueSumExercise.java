package Exercises.Level2Intermediate;

public class UniqueSumExercise {

    public static int getSum(int num1, int num2, int num3) {
        int sum = 0;
        if (num1 == num2 && num2 == num3 && num1 == num3) {
            sum = 0;
        } else if (num2 == num3) {
            sum = num1;
        } else if (num1 == num3) {
            sum = num2;
        } else if (num1 == num2) {
            sum = num3;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 2, num2 = 1, num3 = 2;
        System.out.println(getSum(num1, num2, num3));
    }
}
