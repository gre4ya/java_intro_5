package characterClass;

import utilities.NumberOfLettersCounter;

public class EasyMethodPractices {
    public static void main(String[] args) {

        String s = "2860 south river road des plaines il";
        String s2 = "12334 @!#$!@ TechGlobal";
        String s3 = "TeChGloBal";
        String s4 = "123123 TeChGloBal #$%#$%";

        System.out.println("String: \"" + s + "\" has: " +
                NumberOfLettersCounter.countLetters(s) + " letters");

        System.out.println("String: \"" + s2 + "\" has: " +
                NumberOfLettersCounter.countUpperCases(s2) + " uppercase letters");

        System.out.println("String: \"" + s3 + "\" has: " +
                NumberOfLettersCounter.countUpperCases(s3) + " uppercase letters");

        System.out.println("String: \"" + s4 + "\" has: " +
                NumberOfLettersCounter.countUpperCases(s4) + " uppercase letters");

        NumberOfLettersCounter.printStringAttributes(s2);





    }


}
