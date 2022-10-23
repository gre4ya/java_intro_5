package string_methods;

import utilities.ScannerHelper;

public class Exercise05_FirstAndLastChars {
    public static void main(String[] args) {

        String name = ScannerHelper.getAName();
        char charFirst = name.charAt(0);
        char charLast = name.charAt(name.length() - 1);

        System.out.println("First character in the name is = " + charFirst);
        System.out.println("Last character in the name is = " + charLast);
    }
}
