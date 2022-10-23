package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {

//        // 1. Crate an array
//        double[] numbers = {5.5, 6, 10.3, 25};
//
//        // 2. Print the array
//        System.out.println(Arrays.toString(numbers)); // [5.5, 6.0, 10.3, 25.0]
//
//        // 3. Print the size of the array
//        System.out.println(numbers.length); // 4
//
//        System.out.println("--------------for-each-loop--------------");
//        for(double number : numbers){
//            System.out.println(number);
//        }
//        String str = "*xa*az";
//        if(str.charAt(0) == '*') ;
//        else{
//            for(int i = 1; i < str.length(); i++){
//                if(str.charAt(i) == '*' && str.charAt(i - 1) == str.charAt(i + 1) &&
//                        Character.isLetter(str.charAt(i)));
//
//            }
//        }
        System.out.println(35 % 3);
        System.out.println(37 % 3);
        System.out.println(38 % 3);


        String str = "1234567890";
        String newStr = "";
        if (str.length() % 3 == 0) {
            for (int i = 0; i < str.length(); i += 3) {
                newStr += str.substring(i + 1, i + 3) + str.substring(i, i + 1);
            }
        }
        else if (str.length() % 3 == 1) {
            str = str.substring(0, str.length() - 1);
            for (int i = 0; i < str.length(); i += 3) {
                newStr += str.substring(i + 1, i + 3) + str.substring(i, i + 1);
            }
        }
        else if (str.length() % 3 == 2) {
            str = str.substring(0, str.length() - 2);
            for (int i = 0; i < str.length(); i += 3) {
                    newStr += str.substring(i + 1, i + 3) + str.substring(i, i + 1);
                }
            }
        System.out.println(newStr);

        str.replaceAll("zip", "zp");
        str.replaceAll("zop", "zp");

    }

}
