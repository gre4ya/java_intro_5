package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework12 {
    /////////////////////TASK 1/////////////////////
    public static String noDigit(String str){
        return str.replaceAll("\\d", "");
    }
    /////////////////////TASK 2/////////////////////
    public static String noVowel(String str){
        //return str.replaceAll("a|A|o|O|u|U|i|I|e|E", "");
        return str.replaceAll("[aAoOuUiIeE]", "");
    }
    /////////////////////TASK 3/////////////////////
    public static int sumOfDigits(String str){
       int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
    /////////////////////TASK 4/////////////////////
    public static boolean hasUpperCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }
    /////////////////////TASK 5/////////////////////
    public static int middleInt(int a, int b, int c){
        int[] nums = {a, b, c};
       Arrays.sort(nums);
        return nums[1];
    }
    /////////////////////TASK 6/////////////////////
    public static int[] no13(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }
    /////////////////////TASK 7/////////////////////
    public static int[] arrFactorial(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = 1;
            for (int j = 1; j <= arr[i]; j++) value *= j;
            arr[i] = value;
        }
        return arr;
    }
    /////////////////////TASK 8/////////////////////
    public static String[] categorizeCharacters(String str){
        String[] result = {"","",""};
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) result[0] += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) result[1] += str.charAt(i);
            else if (!Character.isWhitespace(str.charAt(i))) result[2] += str.charAt(i);
        }
        return result;
//        return new String[]{
//                            str.replaceAll("[^a-zA-Z]",""),
//                            str.replaceAll("[^0-9]",""),
//                            str.replaceAll("[a-zA-Z0-9 ]","")};
    }
    public static void main(String[] args) {

        System.out.println("-----------------Task-1-----------------");
        System.out.println(noDigit(""));
        System.out.println(noDigit("java"));
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("123Tech456Global149"));

        System.out.println("-----------------Task-2-----------------");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));

        System.out.println("-----------------Task-3-----------------");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John’s age is 29"));
        System.out.println(sumOfDigits("$125.0"));

        System.out.println("-----------------Task-4-----------------");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John’s age is 29"));
        System.out.println(hasUpperCase("$125.0"));

        System.out.println("-----------------Task-5-----------------");
        System.out.println(middleInt(1, 1, 1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5, 5, 8));
        System.out.println(middleInt(5, 3, 5));
        System.out.println(middleInt(1, 25, 10));

        System.out.println("-----------------Task-6-----------------");
        System.out.println(Arrays.toString(no13(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3})));
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13 , 13, 13})));

        System.out.println("-----------------Task-7-----------------");
        System.out.println(Arrays.toString(arrFactorial(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{0, 5})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{5, 0, 6})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{})));

        System.out.println("-----------------Task-8-----------------");
        System.out.println(Arrays.toString(categorizeCharacters("     ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));
    }
}
