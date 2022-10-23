package arrays;

import java.util.Arrays;

public class _05_CharArray {
    public static void main(String[] args) {

        /*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H

        Print the array

        EXPECTED:
        [#, $, 5, A, b, H]
         */

        System.out.println("-----------Task-1-----------");

        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));

        /*
        TASK-2
        Print the size of the array with a message

        EXPECTED:
        The size of the array is = 6
         */

        System.out.println("----------TASK-2-----------");

        System.out.println("The size of the array is = " + characters.length);

        /*
        TASK-3
        Print each element using fori loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
        */

        System.out.println("----------TASK-3-----------");

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        /*
        TASK-4
        Print each element using for each loop
         */

        System.out.println("----------TASK-4-----------");

        for(char character : characters){
            System.out.println(character);
        }

        /*
        TASK-5
        Print each element that are letters

        EXPECTED:
        A
        b
        H
         */

        System.out.println("----------TASK-5-----------");

        System.out.println("---for-each-loop---");

        for (char character : characters){
            if(Character.isLetter(character))
                System.out.println(character);
        }

        System.out.println("-----for-i-loop-----");
        for (int i = 0; i < characters.length; i++) {
            if(Character.isLetter(characters[i]))
                System.out.println(characters[i]);
        }

        /*
        TASK-6
        Count how many uppercase characters you have in the array

        EXPECTED:
        2
         */
        System.out.println("----------TASK-6-----------");

        System.out.println("---for-each-loop---");

        int countUpperCase = 0;
        for (char character : characters) {
            if (Character.isUpperCase(character))
                countUpperCase++;
        }
        System.out.println(countUpperCase);

        System.out.println("-----for-i-loop-----");

        countUpperCase = 0;

        for (int i = 0; i < characters.length; i++) {
            if (Character.isUpperCase(characters[i]))
                countUpperCase++;
        }
        System.out.println(countUpperCase);



    }
}
