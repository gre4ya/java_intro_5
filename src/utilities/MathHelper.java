package utilities;

public class MathHelper {

    public static int maxOfThree(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }

    public static int minOfThree(int num1, int num2, int num3){
        return Math.min(Math.min(num1, num2), num3);
    }

    public static int middleOfThree(int num1, int num2, int num3){
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);
        return num1 + num2 + num3 - min - max;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isOdd(int num){
        return !isEven(num); // return num % 2 != 0
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static long sum(long num1, long num2){
        return num1 + num2;
    }

    public static int sum(byte num1, int num2){
        return num1 + num2;
    }


}
