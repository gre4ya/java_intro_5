package regex;

import utilities.ScannerHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");
        Matcher matcher = pattern.matcher("hello");

        System.out.println(matcher.matches()); // true

        pattern = Pattern.compile("SDET");
        matcher = pattern.matcher("TechGlobal provides students a complete educational " +
                "program to be a competitive SDET in the professional IT field. With the course, " +
                "students learn all the fundamental technologies needed to become an SDET professional " +
                "and how important testing is in the Software Development Life Cycle (SDLC)… Learn more " +
                "about the technologies that TechGlobal provides to its participants below and feel " +
                "free to reach out to us with any questions.");

//        System.out.println(matcher.find());
//        System.out.println(matcher.group());
//        System.out.println("Starting index: " + matcher.start());
//        System.out.println("Ending index: " + matcher.end());
//
//        System.out.println(matcher.find());
//        System.out.println(matcher.group());
//        System.out.println("Starting index: " + matcher.start());
//        System.out.println("Ending index: " + matcher.end());
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println(matcher.group());
            System.out.println("Starting index: " + matcher.start());
            System.out.println("Ending index: " + matcher.end());
        }
        System.out.println("SDET appears " + count + " times");

        /*
        Ask the user to enter a sentence and count how many words are in the sentence.
        The regex pattern for a single word is [A-Za-z]{1,}
        print out how many words are in the sentence.
        Scenario 1:
        Program: Please enter a sentence
        User: Hello, my name is John.
        Program:
        Hello
        my
        name
        is
        John
        This sentence contains 6 words
        Scenario 2:
        Program: Please enter a username
        User:
        Program: This sentence contains 0 words
         */

        pattern = Pattern.compile("[A-Za-z]{1,}");

        String sentence = ScannerHelper.getAString();
        matcher = pattern.matcher(sentence);

        int wordCount = 0;
        while(matcher.find()){
            System.out.println(matcher.group());
            wordCount++;
        }
        System.out.println("This sentence contains " + wordCount + " words");

        /*
        Write a regex pattern with the conditions below:
        • Must be more than 8 characters.
        • Must be no more than 15 characters.
        • Could include letters(Upper and Lower), numbers, _, and -
         */

        System.out.println(Pattern.matches("[A-Za-z0-9-_]{9,15}", "Tech_Global")); // true

    }
}
