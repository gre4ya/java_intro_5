package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("--------------TASK-1--------------");

        String [] words = {"foo", "", " ", "foo bar", "java is fun", "ruby"};
        System.out.println(countMultipleWords(words));

        System.out.println("--------------TASK-2--------------");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));

        System.out.println(removeNegatives(numbers));

    }

    ///////////////////////TASK-1/////////////////////////////
    public static int countMultipleWords(String[] words){
//
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
}
