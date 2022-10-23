package mathClass;

import java.util.Random;

public class MathRandomMethod {
    public static void main(String[] args) {

        double myRandom = Math.random();
        int myRandomBetween0To10 = (int) (Math.random() * 11); // 0 - 10 (included)
        int myDice = (int) (Math.random() * 6) + 1;

        //  (int)(randomNumber * (big point - small point + 1) + small point)

        // System.out.println("Random number is = " + Math.random());
        System.out.println("Random number is = " + myRandom);
        System.out.println("Random number between 0 to 10 is = " + myRandomBetween0To10);
        System.out.println("Number on the dice is = " + myDice);

        int myRandomBetween50And100 = (int) (Math.random() * (100 - 50 + 1) + 50);
        System.out.println("My random number between 50 and 100 = " + myRandomBetween50And100);

        int myRandomBetween20And40 = (int) (Math.random() * (40 - 20 + 1) + 20);
        System.out.println("My random number between 20 and 40 = " + myRandomBetween20And40);

        Random random = new Random(); // import java.util.Random;
        int randomNumberFromRandom1 = random.nextInt(10) + 1; // 1 to 10
        int randomNumberFromRandom2 = random.nextInt(40) + 23; // range 23 -> 39+23)

        // random.nextInt( big point - small point + 1 ) + small point;
        // random.nextInt( 100 - 50 + 1 ) + 50; --> (51) + 50
        System.out.println(randomNumberFromRandom1);
        System.out.println(randomNumberFromRandom2);






    }

}
