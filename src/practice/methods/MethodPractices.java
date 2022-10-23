package practice.methods;

import java.lang.reflect.Method;

public class MethodPractices {
    public static void main(String[] args) {

        //MethodPractices.printStringValues("JavaScript");

//        MethodPractices.printMiddleChars("Toyota");
//        MethodPractices.printMiddleChars("civic");
//        MethodPractices.printMiddleChars("");
//        MethodPractices.printMiddleChars("ab");

//        MethodPractices.printToChars("banana");
//        MethodPractices.printToChars("viv");
//        MethodPractices.printToChars("Andrew");
//        MethodPractices.printToChars("abcd");

        MethodPractices.printIsFirstLastTwoSame("andnan");
        MethodPractices.printIsFirstLastTwoSame("abcdm");
        MethodPractices.printIsFirstLastTwoSame("ab");
        MethodPractices.printIsFirstLastTwoSame("a");
    }

    public static void printStringValues(String str) {
        if (str.isEmpty()) System.out.println("Length is zero");
        else {
            System.out.println("Length is = " + str.length());
            System.out.println("First char is = " + str.charAt(0));
            System.out.println("Last char is = " + str.charAt(str.length() - 1));
            if (containsVowel(str)) System.out.println("This String has vowel");
            else System.out.println("This String does not have vowel");

//           if(str.toLowerCase().contains("a") || str.toLowerCase().contains("e") ||
//              str.toLowerCase().contains("i") || str.toLowerCase().contains("u") ||
//              str.toLowerCase().contains("o"))
//                 System.out.println("This String has vowel");
//            else System.out.println("This String does not have vowel");
        }
    }

    public static boolean containsVowel(String s) {
        return s.toLowerCase().contains("a") || s.toLowerCase().contains("e") ||
                s.toLowerCase().contains("i") || s.toLowerCase().contains("u") ||
                s.toLowerCase().contains("o");
    }

    public static void printMiddleChars(String apple) {
        if (apple.length() < 3) System.out.println("Length is less than 3");
        else {
            if (apple.length() % 2 == 0)
                System.out.println(apple.substring(apple.length() / 2 - 1, apple.length() / 2 + 1));
            else System.out.println(apple.charAt(apple.length() / 2));
        }
    }

    public static void printToChars(String banana) {
        if (banana.length() < 4) System.out.println("INVALID INPUT");
        else {
            System.out.println("The first two characters are = " + banana.substring(0, 2));
            System.out.println("Last two characters are = " + banana.substring(banana.length() - 2));
            System.out.println("The other characters are = " + banana.substring(2, banana.length() - 2));
        }
    }

    public static void printIsFirstLastTwoSame(String s) {
        System.out.println( s.length() < 2 ?
                "Length is less than 2" : s.substring(0, 2).equals(s.substring(s.length() - 2)));
    }




}
