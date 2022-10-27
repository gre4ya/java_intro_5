package arrays;

import java.util.Arrays;

public class _12_charArrayRecap {
    public static void main(String[] args) {

        char[] nameLetters1 = {'A', 'n', 'd', 'r', 'i', 'i'};
        char[] nameLetters2 = new char[6];
        nameLetters2[0] = 'A';
        nameLetters2[1] = 'n';
        nameLetters2[2] = 'd';
        nameLetters2[3] = 'r';
        nameLetters2[4] = 'i';
        nameLetters2[5] = 'i';

        System.out.println(Arrays.toString(nameLetters1));
        System.out.println(Arrays.toString(nameLetters2));

        nameLetters2[0] = 'a';
        System.out.println(Arrays.toString(nameLetters2));

        for (char letter : nameLetters1) {
            System.out.print(letter);
        }

    }
}
