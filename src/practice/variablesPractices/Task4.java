package practice.variablesPractices;

public class Task4 {
    public static void main(String[] args) {

        /*
         Requirement:
        - Assume you are given a single character. (It will be hard-coded)
        - If given char is a letter, then print "Character is a letter"
        - If given char is a digit, then print "Character
         */

        char myChar = '5';
        int num = (int) myChar;
        if(num > 64 & num < 91 || num > 96 & num < 123)System.out.println("Character is a letter");
        else if(num > 47 & num < 58)System.out.println("Character is a digit");
        else System.out.println("Character is neither a letter nor a digit");

        int randomNumber1, randomNumber2, randomNumber3;

        randomNumber1 = (int) (Math.random() * 51 + 50);
        randomNumber2 = (int) (Math.random() * 51 + 50);
        randomNumber3 = (int) (Math.random() * 51 + 50);
        System.out.println("Number 1 = " + randomNumber1);
        System.out.println("Number 2 = " + randomNumber2);
        System.out.println("Number 3 = " + randomNumber3);
    }
}
