package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("--------------TASK-1--------------");

        String [] words = {"foo", "", " ", "foo bar", "java is fun", " ruby ", "976", "9 9"};
        System.out.println(countMultipleWords(words));

        System.out.println("--------------TASK-2--------------");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));

        System.out.println(removeNegatives(numbers));

        System.out.println("--------------TASK-3--------------");
        String password1 = "";
        String password2 = "abcd";
        String password3 = "abcd1234";
        String password4 = "Abcd1234";
        String password5 = "Abcd1234!";

        System.out.println(validatePassword(password1));
        System.out.println(validatePassword(password2));
        System.out.println(validatePassword(password3));
        System.out.println(validatePassword(password4));
        System.out.println(validatePassword(password5));

        System.out.println("--------------TASK-4--------------");

        String email1 = "a@gmail.com";
        String email2 = "abc@g.mail.com";
        String email3 = "abc@gmail.c";
        String email4 = "abc@@gmail.com";
        String email5 = "abcd@gmail.com";

        System.out.println(validateEmailAddress(email1));
        System.out.println(validateEmailAddress(email2));
        System.out.println(validateEmailAddress(email3));
        System.out.println(validateEmailAddress(email4));
        System.out.println(validateEmailAddress(email5));

    }

    ///////////////////////TASK-1/////////////////////////////
    public static int countMultipleWords(String[] words){
        int count = 0;
        for (String word : words) {
            word = word.trim();
            if(Pattern.matches("[\\w ]+ [\\w ]+", word))
             count++;
        }
        return count;
    }
    ///////////////////////TASK-2/////////////////////////////
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        ArrayList<Integer> results = new ArrayList<>();
        for (Integer number : numbers) {
            if(Pattern.matches("[\\d]{1,}", number.toString()))
               results.add(number);
        }
        return results;
    }

    ///////////////////////TASK-3/////////////////////////////
    public static boolean validatePassword(String password){
        return Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#$%*&!?+_])[\\S]{8,16}",password);
    }

    ///////////////////////TASK-4/////////////////////////////
    public static boolean validateEmailAddress(String email){
        return Pattern.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w]{2,}", email);
    }

}
