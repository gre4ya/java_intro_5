package methods;

import utilities.RandomNumberGenerator;

public class RandomNumberPractices {
    public static void main(String[] args) {

        int r1 = RandomNumberGenerator.getARandomNumber(5, 15);
        int r2 = RandomNumberGenerator.getARandomNumber(3, 10);
        int r3 = RandomNumberGenerator.getARandomNumber(50, 55);
        int r4 = RandomNumberGenerator.getARandomNumber(6, 63);
        int r5 = RandomNumberGenerator.getARandomNumber(100, 113);

        System.out.println("First random number is = " + r1);
        System.out.println("Second random number is = " + r2);
        System.out.println("Third random number is = " + r3);
        System.out.println("Fourth random number is = " + r4);
        System.out.println("Fives random number is = " + r5);

        System.out.println("The average of these numbers is = " + (r1 + r2 + r3 + r4 + r5) / 5);

    }
}
