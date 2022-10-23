package utilities;

public class NumberOfLettersCounter {
    public static int countLetters(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                counter++;
        }
        return counter;
    }

    public static int countUpperCases(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                counter++;
        }
        return counter;
    }

    public static void printStringAttributes(String s){
        int upperCaseCounter = 0;
        int lowerCaseCounter = 0;
        int digitCounter = 0;
        int spaceCounter = 0;
        int specialCharacterCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                upperCaseCounter++;
            else if (Character.isLowerCase(c))
                lowerCaseCounter++;
            else if (Character.isDigit(c))
                digitCounter++;
            else if (Character.isWhitespace(c))
                spaceCounter++;
            else specialCharacterCounter++;
        }
        System.out.println("Given \"" + s +  "\"has:\n"
                        + upperCaseCounter + " amount of upper cases\n"
                        + lowerCaseCounter + " amount of lower cases\n"
                        + (upperCaseCounter + lowerCaseCounter) + " amount of letters\n"
                        + digitCounter + " amount of digits\n"
                        + spaceCounter + " amount of spaces\n"
                        + specialCharacterCounter + " amount of special characters.");

    }

}