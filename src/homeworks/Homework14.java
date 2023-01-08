package homeworks;

import java.util.Arrays;

public class Homework14 {
    ///////////////////////Task-1///////////////////////
    public static void fizzBuzz1(int n){
        for (int i = 1; i <= n; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
        System.out.println("-----End of the program-----");
    }
    ///////////////////////Task-2///////////////////////
    public static String fizzBuzz2(int n){
        if(n % 15 == 0) return "FizzBuzz";
        else if(n % 5 == 0) return "Buzz";
        else if(n % 3 == 0) return "Fizz";
        return String.valueOf(n);
    }
    ///////////////////////Task-3///////////////////////
    public static int findSumNumbers(String str){
        try{
            int sum = 0;
            String[] arr = str.replaceAll("[^0-9]+", " ").trim().split("[ ]+");
            for (String s : arr) {
                sum += Integer.parseInt(s);
            }
            return sum;
        }
        catch (Exception e){
            return 0;
        }
    }
    ///////////////////////Task-4///////////////////////
    public static int findBiggestNumber(String str){
        try{
            String[] arr = str.replaceAll("[^0-9]+", " ").trim().split("[ ]+");
            int[] nums = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                nums[i] = Integer.parseInt(arr[i]);
            }
            return Arrays.stream(nums).reduce(nums[0], Math::max);
        }
        catch (Exception e){
            return 0;
        }
    }
    ///////////////////////Task-5///////////////////////
    public static String countSequenceOfCharacters(String str){
        int count = 1;
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) count++;
            else {
                result += String.valueOf(count) + str.charAt(i);
                count = 1;
            }
            if(i == str.length() - 2) result += String.valueOf(count) + str.charAt(i + 1);
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println("--------------Task-1--------------");

        fizzBuzz1(3);
        fizzBuzz1(5);
        fizzBuzz1(18);

        System.out.println("--------------Task-2--------------");

        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("--------------Task-3--------------");

        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c 6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));
        System.out.println(findSumNumbers("5asdf2fghj5jk"));

        System.out.println("--------------Task-4--------------");

        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c 6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));
        System.out.println(findBiggestNumber("5asdf2fghj5jk"));

        System.out.println("--------------Task-5--------------");

        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));

    }
}
