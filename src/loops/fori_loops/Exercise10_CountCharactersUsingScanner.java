package loops.fori_loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {

        String name = ScannerHelper.getAName();
        int counter = 0;

        for (int i = 0; i <= name.length() - 1; i++) {
            if (name.toLowerCase().charAt(i) == 'l') counter++;
        }
        System.out.println(counter);
    }
}
