package loops.while_loops;

import utilities.RandomNumberGenerator;

public class Exercise03_GuessingNumber {
    public static void main(String[] args) {

        int number = 7;
        int random = RandomNumberGenerator.getARandomNumber(1, 10);
        int attempt = 1;

        while(random != number){
            System.out.println("The random is " + random);
            random = RandomNumberGenerator.getARandomNumber(1, 10);
            attempt++;
        }
        if(attempt == 1)System.out.println("It took " + attempt + " time to generate " + number);
        else System.out.println("It took " + attempt + " times to generate " + number);
    }
}
