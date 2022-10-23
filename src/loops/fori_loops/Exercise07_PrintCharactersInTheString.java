package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise07_PrintCharactersInTheString {
    public static void main(String[] args) {
        String str = "TechGlobal School";
        for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));

        }
    }
}
