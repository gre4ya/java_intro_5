package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {
        /*
        Print all even numbers in the range of
        two input by users numbers from smaller to larger
         */

       int num1 = ScannerHelper.getANumber();
       int num2 = ScannerHelper.getANumber();
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2) ; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
