package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("---------------Task-1---------------");

        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));

        System.out.println("---------------Task-2---------------");

        System.out.println(noZero(new ArrayList<>(Arrays.asList(1))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1, 1, 10))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 1, 10))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 0, 0))));

        System.out.println("---------------Task-3---------------");

        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));

        System.out.println("---------------Task-4---------------");

        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "Java", "Hello"}, "123"));

        System.out.println("---------------Task-5---------------");

        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("---------------Task-6---------------");

        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println("---------------Task-7---------------");

        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));

        System.out.println("---------------Task-8---------------");

        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
                                                  new ArrayList<>(Arrays.asList("abc", "xyz", "123"))));

        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
                                                  new ArrayList<>(Arrays.asList("Java", "C#", "Python"))));

        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#", "C#")),
                                                  new ArrayList<>(Arrays.asList("Python", "C#", "C++"))));

        System.out.println("---------------Task-9---------------");

        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("abc", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyz", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("x", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"))));

    }
    ///////////////////////Task-1///////////////////////
    public static boolean hasLowerCase(String str){
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) {
                result = true;
                break;
            }
        }
        return result;
    }
    ///////////////////////Task-2///////////////////////
    public static ArrayList<Integer> noZero(ArrayList<Integer> nums){
        nums.removeIf(num -> num == 0);
        return nums;
    }
    ///////////////////////Task-3///////////////////////
    public static int[][] numberAndSquare(int[] arr){
        int[][] result = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            result[i][0] = arr[i];
            result[i][1] = arr[i] * arr[i];
        }
        return result;
    }
    ///////////////////////Task-4///////////////////////
    public static boolean containsValue(String[] arr, String str){
    /////////////////solution-1///////////////////////////
        /*
        boolean result = false;
        for (String s : arr) {
            if(s.equals(str)){
                result = true;
                break;
            }
        }
        return result;
         */
    /////////////////solution-2//////////////////////////
        /*
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, str) >= 0;
        */
    /////////////////solution-3/////////////////////////
        return Arrays.asList(arr).contains(str);

    }
    ///////////////////////Task-5///////////////////////
    public static String reverseSentence(String str){
        str = str.toLowerCase().trim();
        String result = "";
        if(!str.contains(" ")) return "There is not enough words!";
        else{
            String[] arr = str.split("[ ]+");
            result += arr[arr.length-1].substring(0,1).toUpperCase() + arr[arr.length-1].substring(1) + " ";
            for (int i = arr.length - 2; i >= 1; i--) {
                result += arr[i] + " ";
            }
            result += arr[0].toLowerCase();
        }
        return result;
    }
    ///////////////////////Task-6///////////////////////
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^a-zA-Z ]", "");
    /*
        String result = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isLetter(arr[i]) || Character.isWhitespace(arr[i]))
                result += arr[i];
        }
        return result;
    */
    }

    ///////////////////////Task-7///////////////////////
    public static String[] removeArraySpecialsDigits(String[] arr){
        for (int i = 0; i < arr.length; i++) {
           // arr[i] = removeStringSpecialsDigits(arr[i]);
            arr[i] = arr[i].replaceAll("[^a-zA-Z ]", "");
        }
        return arr;
    }
    ///////////////////////Task-8///////////////////////
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
        LinkedHashSet<String> set1 = new LinkedHashSet<>(arr1);
        LinkedHashSet<String> set2 = new LinkedHashSet<>(arr2);
        ArrayList<String> result = new ArrayList<>();
        for (String set : set1) {
            if(set2.contains(set)) result.add(set);
        }
        return result;
    }
    ///////////////////////Task-9///////////////////////
    public static ArrayList<String> noXInVariables(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(s.replaceAll("[xX]",""));
        }
        result.remove("");
        return result;
    }
}
