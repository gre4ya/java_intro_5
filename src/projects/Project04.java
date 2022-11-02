package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        System.out.println("--------Task-1--------");

        String str = ScannerHelper.getAString();
        if (str.length() >= 8) {
            String first4 = str.substring(0, 4);
            String middle = str.substring(4, str.length() - 4);
            String last4 = str.substring(str.length() - 4);
            System.out.println(last4 + middle + first4);
        }
        else System.out.println("This String does not have 8 characters");

        System.out.println("--------Task-2--------");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        str = input.nextLine();
        str = str.trim();

        if (str.contains(" ")) {

            String firstWord = str.substring(0, str.indexOf(' '));
            String middleSentence = str.substring(str.indexOf(' '), str.lastIndexOf(' ') + 1);
            String lastWord = str.substring(str.lastIndexOf(' ') + 1);

            System.out.println(lastWord + middleSentence + firstWord);
        } else System.out.println("This sentence does not have 2 or more words to swap");

        System.out.println("--------Task-3--------");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";


        System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(str2.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));

        System.out.println("--------Task-4--------");

        String name = ScannerHelper.getAName();
        if (name.length() > 2) {
            if (name.length() % 2 == 0)
                System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
            else System.out.println(name.substring(name.charAt(name.length() / 2)));
        } else System.out.println("Invalid input!!!");

        System.out.println("--------Task-5--------");

        System.out.println("Please enter a country");
        String country = input.nextLine();

        if (country.length() > 5)
            System.out.println(country.substring(2, country.length() - 2));
        else
            System.out.println("Invalid input!!!");

        System.out.println("--------Task-6--------");

        String address = ScannerHelper.getAnAddress();

        address = address.replace('a', '*').replace('A','*').
                replace('e','#').replace('E', '#').
                replace('i','+').replace('I','+').
                replace('u','$').replace('U','$').
                replace('o','@').replace('O', '@');
        System.out.println(address);

        System.out.println("--------Task-7--------");

        int randomNumber1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int randomNumber2 = RandomNumberGenerator.getARandomNumber(0, 25);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);

        String sequence = "";
        for (int i = Math.min(randomNumber1, randomNumber2); i <= Math.max(randomNumber1, randomNumber2); i++) {
            if (i % 5 != 0)
                sequence += i + " - ";
        }
        System.out.println(sequence.substring(0, sequence.length() - 3));

        System.out.println("--------Task-8--------");

        System.out.println("Please enter a sentence");
        String newSentence = input.nextLine();

        int count = 0;

        for (int i = 0; i < newSentence.length(); i++) {
            if (newSentence.charAt(i) == ' ')
                count++;
        }
        if (count > 0)
            System.out.println("This sentence has " + (count + 1) + " words.");
        else
            System.out.println("This sentence does not have multiple words");

        System.out.println("--------Task-9--------");

        System.out.println("Please enter positive number");
        int num = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= num; i++) {
            if (i % 6 == 0)
                System.out.println("FooBar");
            else if (i % 2 == 0)
                System.out.println("Foo");
            else if (i % 3 == 0)
                System.out.println("Bar");
            else
                System.out.println(i);
        }
        System.out.println("--------Task-10--------");

        System.out.println("Please enter a word");
        String word = input.nextLine();
        String palindrome = "";

        if (word.length() == 0)
            System.out.println("This word does not have 1 or more characters");
        else if (word.length() == 1)
            System.out.println("This word is palindrome");
        else {
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) == word.charAt(word.length() - 1 - i))
                    palindrome = "This word is palindrome";
                else
                    palindrome = "This word is not palindrome";
            }
        }
        System.out.println(palindrome);

        System.out.println("--------Task-11--------");

        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        sentence = sentence.toLowerCase();
        int counter = 0;

        if (sentence.length() > 0) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'a')
                    counter++;
            }
            if (counter == 1)
                System.out.println("This sentence has 1 a or A letter.");
            else
                System.out.println("This sentence has " + counter + " a or A letters.");
        } else
            System.out.println("This sentence does not have any characters");
    }
}


