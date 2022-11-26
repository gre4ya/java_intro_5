package homeworks;

import java.util.*;
import java.util.stream.Collectors;

public class Homework10 {

    public static void main(String[] args) {

        System.out.println("-------------Task-1-------------");

        String str1 = "      Java   is  fun       ";
        String str2 = "Selenium is the most common UI automation tool.   ";
        System.out.println(countWords(str1));
        System.out.println(countWords(str2));

        System.out.println("-------------Task-2-------------");

        String str3 = "TechGlobal is a QA bootcamp";
        String str4 = "QA stands for Quality Assurance";
        System.out.println(countA(str3));
        System.out.println(countA(str4));

        System.out.println("-------------Task-3-------------");

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println(countPos(numbers1));
        System.out.println(countPos(numbers2));

        System.out.println("-------------Task-4-------------");

        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println(removeDuplicateNumbers(numbers3));
        System.out.println(removeDuplicateNumbers(numbers4));

        System.out.println("-------------Task-5-------------");

        ArrayList<String> str5 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        ArrayList<String> str6 = new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"));

        System.out.println(removeDuplicateElements(str5));
        System.out.println(removeDuplicateElements(str6));

        System.out.println("-------------Task-6-------------");

        String str7 = "    I   am      learning     Java      ";
        String str8 = "Java  is fun    ";

        System.out.println(removeExtraSpaces(str7));
        System.out.println(removeExtraSpaces(str8));

        System.out.println("-------------Task-7-------------");

        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};

        int[] arr3 =  {10, 3, 6, 3, 2};
        int[] arr4 = {6, 8, 3, 0, 0, 7, 5, 10, 34};

        System.out.println(Arrays.toString(add(arr1, arr2)));
        System.out.println(Arrays.toString(add(arr3, arr4)));

        System.out.println("-------------Task-8-------------");

        int[] numbers5 = {10, -13, 5, 70, 15, 57};
        int[] numbers6 = {10, -13, 8, 12, 15, -20};
        int[] numbers7 = {10, -13, 8, 12, 15, -20, 1, 4, 0};
        int[] numbers8 = {10, -13, 8, 12, 15, -20, 11, 0, 2, 9};

        System.out.println(findClosestTo10(numbers5));
        System.out.println(findClosestTo10(numbers6));
        System.out.println(findClosestTo10(numbers7));
        System.out.println(findClosestTo10(numbers8));


    }

    //-------------Task-1-----------------

    public static int countWords(String str){
        String[] arr = str.trim().split("[ ]+");
        return arr.length;
    }

    //-------------Task-2-----------------

    public static int countA(String str){
//--------------------------------------------------------------
//        char[] arr = str.toLowerCase().toCharArray();
//        List<Character> chars = new ArrayList<>();
//        for (Character a : arr) {
//            chars.add(a);
//        }
//        return (int)chars.stream().filter(c -> c == 'a').count();
//--------------------------------------------------------------
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.toLowerCase().charAt(i) == 'a') count++;
//        }
//        return count;
//--------------------------------------------------------------
          str = str.toLowerCase().replaceAll("[\\W[^a]]", "");
          return str.length();

    }

    //-------------Task-3-----------------
    public static int countPos(ArrayList<Integer> numbers){
//--------------------------------------------------------------
//        int count = 0;
//        for (Integer number : numbers) {
//            if(number > 0) count++;
//        }
//        return count;
//--------------------------------------------------------------
        return (int) numbers.stream().filter(num -> num > 0).count();
    }

    //-------------Task-4-----------------

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
//--------------------------------------------------------------
//        ArrayList<Integer> result = new ArrayList<>();
//        for (Integer number : numbers) {
//            if(!result.contains(number))
//                result.add(number);
//        }
//        return result;
//--------------------------------------------------------------
        return (ArrayList<Integer>) numbers.stream().distinct().collect(Collectors.toList());
    }

    //-------------Task-5-----------------

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){
//--------------------------------------------------------------
//        ArrayList<String> result = new ArrayList<>();
//        for (String s : str) {
//            if(!result.contains(s))
//                result.add(s);
//        }
//        return result;
//--------------------------------------------------------------
        return (ArrayList<String>) str.stream().distinct().collect(Collectors.toList());
    }

    //-------------Task-6-----------------

    public static String removeExtraSpaces(String str){
        return str.trim().replaceAll("[ ]+", " ");
    }

    //-------------Task-7-----------------

    public static int[] add(int[]a, int[]b){
       for (int i = 0; i < Math.min(a.length, b.length); i++) {
           if(a.length > b.length) a[i] += b[i];
           else b[i] += a[i];
       }
        return a.length > b.length ? a : b;
    }

    //-------------Task-8-----------------

    public static int findClosestTo10(int[] numbers){
        int closestTo10 = numbers[0];

        for (int number : numbers) {
            if(number == 0) continue;
            if(10 % number < closestTo10) closestTo10 = number;
        }
        return closestTo10;
    }

}
