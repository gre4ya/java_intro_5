package loops;

import utilities.ScannerHelper;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {
        System.out.println("-----solution 1-----");

        String name = ScannerHelper.getAName();
        String reverseName = "";

        for (int i = 0; i <= name.length() - 1; i++) {
            reverseName += String.valueOf(name.charAt(name.length() - 1 - i));
        }
        System.out.print(reverseName);

        System.out.println("\n-----solution 2-----");

        String name1 = ScannerHelper.getAName();
        String reverseName1 = "";

        for (int i = name1.length()-1; i >=0 ; i--) {
            reverseName1 += name1.charAt(i);
        }
        System.out.print(reverseName1);


    }
}
