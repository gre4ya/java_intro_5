package conditional_statements.if_elseif_ladder_statements;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        if(num>0){
            System.out.println("POSITIVE");
        }
            else if(num<0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("ZERO");
        }
        System.out.println("End of the program");


        //Creating two variables for age and weight
        int age=25;
        int weight=48;
        //applying condition on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }

    }

}

