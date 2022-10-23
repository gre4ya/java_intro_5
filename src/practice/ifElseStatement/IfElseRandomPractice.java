package practice.ifElseStatement;

import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {

        System.out.println("\n------  TASK 1 -------");

        int randomTask1 = (int)(Math.random()* 51);
        System.out.println(randomTask1);

        System.out.println("------  Solution with boolean -------");

        System.out.println(randomTask1 >= 10 && randomTask1 <= 25);


        System.out.println("------  Solution with ternary -------");

        String s = randomTask1 >= 10 && randomTask1 <= 25 ? "true" : "false";
        System.out.println(s);
        // System.out.println(random >= 10 && random <= 25 ? "true" : "false");


        System.out.println("------  Solution with if else -------");

        if (randomTask1 >= 10 && randomTask1 <= 25) System.out.println("true");
        else System.out.println("false");

        System.out.println("------  TASK 2 -- solution 1 -----");


        int randomTask2 = (int)(Math.random()* 100 + 1);

        System.out.println(randomTask2 <= 50 ? randomTask2 + " is in the 1st half" : randomTask2 + " is in the 2nd half");

        if(randomTask2<=25) System.out.println(randomTask2 + " is in the 1st quarter");
        else if(randomTask2<=50) System.out.println(randomTask2 + " is in the 2st quarter");
        else if(randomTask2<=75) System.out.println(randomTask2 + " is in the 3st quarter");
        else System.out.println(randomTask2 + " is in the 4st quarter");

        System.out.println("-------- solution 2 -----");

        if(randomTask2<=24) {
            System.out.println(randomTask2 + " is in the 1st half");
            System.out.println(randomTask2 + " is in the 1st quarter");
        }
            else if(randomTask2<=50){
                System.out.println(randomTask2 + " is in the 1st half");
                System.out.println(randomTask2 + " is in the 2st quarter");
            }
            else if(randomTask2<=75){
                System.out.println(randomTask2 + " is in the 2st half");
                System.out.println(randomTask2 + " is in the 3st quarter");
            }
        else{
            System.out.println(randomTask2 + " is in the 2st half");
            System.out.println(randomTask2 + " is in the 4st quarter");
        }
        System.out.println("-------- solution 3 -----");

        if(randomTask2<=50){
            System.out.println(randomTask2 + " is in the 1st half");
            if(randomTask2<=24) System.out.println(randomTask2 + " is in the 1st quarter");
            else System.out.println(randomTask2 + " is in the 2st quarter");
        }
        else{
            System.out.println(randomTask2 + " is in the 2st half");
            if(randomTask2<=75) System.out.println(randomTask2 + " is in the 3st quarter");
            else System.out.println(randomTask2 + " is in the 4st quarter");

        }
        System.out.println("-------- solution 4 -----");

        if(randomTask2<=50) {
            System.out.println(randomTask2 + " is in the 1st half");
            System.out.println(randomTask2<=24 ? randomTask2 +
                    " is in the 1st quarter" : randomTask2 + " is in the 2st quarter");
        }
        else {
            System.out.println(randomTask2 + " is in the 2st half");
            System.out.println(randomTask2<=75 ? randomTask2 +
                    " is in the 3st quarter" : randomTask2 + " is in the 4st quarter");
        }

        /*
            // Scanner//
            Is it raining (true/false)
            Do you have umbrella? (true/false)
            Are you hungry? (true/false)

            // if else //
            it is raining -> it is raining outside
                if you have umbrella -> you can go outside
                otherwise -> you stay home

            it is not raining -> it is not raining outside
                if you are hungry -> you go to chick-fil-a
                otherwise -> you are riding a bike
         */
        System.out.println("\n------  TASK 3 -------");
        Scanner input = new Scanner(System.in);

        System.out.println("Is it raining?");
        boolean isItRaining = input.nextBoolean();

        System.out.println("Do you have an umbrella?");
        boolean hasUmbrella = input.nextBoolean();

        System.out.println("Are you hungry?");
        boolean youHungry = input.nextBoolean();

        if(isItRaining){
            System.out.println("It is raining outside");
            if(hasUmbrella){
                System.out.print("You can go outside");
                if(youHungry) System.out.print(" and eat in chick-fil-a");
            }
            else System.out.println("You better stay home");
        }
        else{
            System.out.println("Its not raining outside");
            if(youHungry){
                System.out.println("You can go to eat in chick-fil-a");
            }
            else System.out.println("You can ride a bike");
        }

    }



}
