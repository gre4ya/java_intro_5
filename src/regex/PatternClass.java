package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        System.out.println(pattern);  // returns a pattern
        System.out.println(pattern.pattern()); // returns a pattern as a string
        System.out.println(pattern.toString());// returns a pattern as a string

        System.out.println(Pattern.matches(pattern.pattern(), "Apple"));         // false
        System.out.println(Pattern.matches(pattern.pattern(), "Apple".toLowerCase())); // true
        System.out.println(Pattern.matches(pattern.pattern(), "apple"));         // true
        System.out.println(Pattern.matches(pattern.pattern(), "hello world"));   // false

        String str = "I go to school at TechGlobal and I love it";
        String str2 = "I go to school at TechGlobal and I love it";

        String[] arr = str.split(pattern.pattern());
        System.out.println(Arrays.toString(arr)); // [I go to ,  at TechG,  and I love it]

        pattern = Pattern.compile(" [a-z0-9]{5,10}");
        String[] arr2 = str2.split(pattern.pattern());
        System.out.println(Arrays.toString(arr2)); // [I go to,  at TechGlobal and I love it]


    }
}
