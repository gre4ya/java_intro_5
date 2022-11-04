package homeworks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a word");
//        String word = input.nextLine();
//        String palindrome = "";
//
//        if (word.length() == 0)
//            System.out.println("This word does not have 1 or more characters");
//        else if (word.length() == 1)
//            System.out.println("This word is palindrome");
//        else {
//            for (int i = 0; i < word.length() / 2; i++) {
//                if (word.charAt(i) == word.charAt(word.length() - 1 - i))
//                    palindrome = "This word is palindrome";
//                else
//                    palindrome = "This word is not palindrome";
//            }
//        }
//        System.out.println(palindrome);

        System.out.println("Please enter a word");
        String word = input.nextLine();
        String reverse = "";
        if(word.length() > 0){
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            if(word.equals(reverse)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        }
        else System.out.println("This word does not have 1 or more characters");
    }
}
