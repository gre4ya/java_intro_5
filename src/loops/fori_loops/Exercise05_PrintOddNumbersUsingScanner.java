package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
         /*
         return odd numbers in the range 1 and number entered by user
         */

        int num = ScannerHelper.getANumber();
        System.out.println("----The odd numbers from zero to " + num + " are listed below:");
        for (int i = 0; i <= num; i++) {
            if(i%2 != 0) System.out.println(i);
        }

    }
}
