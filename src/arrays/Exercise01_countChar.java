package arrays;

import java.util.Arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        int counterA = 0;
        String word = "Java";
        for (int i = 0; i < word.length(); i++) {
            if(word.toLowerCase().charAt(i) == 'a') counterA++;
        }
        System.out.println(counterA);

        char[] wordArray = word.toCharArray();

        System.out.println(Arrays.toString(wordArray));  // [J, a, v, a]
        counterA = 0;
        for(char element : wordArray){
            if(element == 'a') counterA++;
        }
        System.out.println(counterA);
    }

}
