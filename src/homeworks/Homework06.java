package homeworks;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("--------------Task-1--------------");

        int[] numbers1 = new int[10];

        numbers1[2] = 23;
        numbers1[4] = 12;
        numbers1[7] = 34;
        numbers1[9] = 7;
        numbers1[6] = 15;
        numbers1[0] = 89;

        System.out.println(numbers1[3]);
        System.out.println(numbers1[0]);
        System.out.println(numbers1[9]);
        System.out.println(Arrays.toString(numbers1));

        System.out.println("--------------Task-2--------------");

        String[] numbers2 = new String[5];

        numbers2[1] = "abc";
        numbers2[4] = "xyz";

        System.out.println(numbers2[3]);
        System.out.println(numbers2[0]);
        System.out.println(numbers2[4]);
        System.out.println(Arrays.toString(numbers2));

        System.out.println("--------------Task-3--------------");

        int[] numbers3 = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers3));
        Arrays.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));

        System.out.println("--------------Task-4--------------");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("--------------Task-5--------------");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));
        Arrays.sort(dogs);

        System.out.println(Arrays.binarySearch(dogs,"Pluto") >= 0);

        System.out.println("--------------Task-6--------------");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cats);

        System.out.println(Arrays.toString(cats));
        System.out.println(Arrays.binarySearch(cats, "Garfield") >= 0 &&
                           Arrays.binarySearch(cats, "Felix") >= 0);

        System.out.println("--------------Task-7--------------");

        double[] numbers7 = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(numbers7));
        for (double number7: numbers7) {
            System.out.println(number7);
        }

        System.out.println("--------------Task-8--------------");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int countLower = 0, countUpper = 0, countDigit = 0, countSpecial = 0;

        for (char character : characters) {
            if(Character.isLowerCase(character))
                countLower++;
            else if(Character.isUpperCase(character))
                countUpper++;
            else if(Character.isDigit(character))
                countDigit++;
            else countSpecial++;
            }

        System.out.println(Arrays.toString(characters));
        System.out.println("Letters = " + (countUpper + countLower));
        System.out.println("Uppercase letters = " + countUpper);
        System.out.println("Lowercase letters = " + countLower);
        System.out.println("Digits = " + countDigit);
        System.out.println("Special characters = " + countSpecial);

        System.out.println("--------------Task-9--------------");

        String[] classStaff = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        countUpper = 0;
        countLower = 0;
        int countBP = 0;
        int counter = 0;

        for (String item : classStaff) {
            if(Character.isUpperCase(item.charAt(0)))
                countUpper++;
            else if(Character.isLowerCase(item.charAt(0)))
                countLower++;
            if(item.toLowerCase().startsWith("b") || item.toLowerCase().startsWith("p"))
                countBP++;
            if(item.toLowerCase().contains("book") || item.toLowerCase().contains("pen"))
                counter++;
        }
        System.out.println(Arrays.toString(classStaff));
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements starting with B or P = " + countBP);
        System.out.println("Elements having ”book” or “pen” = " + counter);

        System.out.println("--------------Task-10--------------");

        int[] numbers10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        int more10 = 0, is10 = 0, less10 = 0;
        for (int number10 : numbers10) {
            if(number10 == 10)
                is10++;
            else if(number10 > 10)
                more10++;
            else
                less10++;
        }
        System.out.println(Arrays.toString(numbers10));
        System.out.println("Elements that are more than 10 = " + more10);
        System.out.println("Elements that are less than 10 = " + less10);
        System.out.println("Elements that are 10 = " + is10);

        System.out.println("--------------Task-11--------------");

        int[] numbersOne = {5, 8, 13, 1, 2};
        int[] numbersTwo = {9, 3, 67, 1, 0};
        int[] numbersThree = new int[5];

        for(int i = 0; i < numbersOne.length; i++){
          numbersThree[i] = Math.max(numbersOne[i], numbersTwo[i]);
        }
        System.out.println("1st array is = " + Arrays.toString(numbersOne));
        System.out.println("2nd array is = " + Arrays.toString(numbersTwo));
        System.out.println("3d array is = " + Arrays.toString(numbersThree));
    }
}
