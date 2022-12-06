package homeworks;

import java.time.Year;
import java.util.Arrays;


public class Homework11 {

    /////////////////TASK-1/////////////////
    public static String noSpace(String str){
        return str.replaceAll(" ", "");
    }

    /////////////////TASK-2/////////////////
    public static String replaceFirstLast(String str){
        str = str.trim();
        if (str.length() > 1) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() -1);
            return "" + lastChar + str.substring(1, str.length() -1) + firstChar;
        }
        return "";
    }

    /////////////////TASK-3/////////////////
    public static boolean hasVowel(String str){
        str = str.toLowerCase();
       return str.contains("a") || str.contains("e") || str.contains("o") || str.contains("u") || str.contains("i");
    }

    /////////////////TASK-4/////////////////
    public static String checkAge(int age){
        int year = Year.now().getValue();
        if(age > year || year - age > 100) return "AGE IS NOT VALID";
        else if(year - age < 16) return "AGE IS NOT ALLOWED";
        return "AGE IS ALLOWED";
    }

    /////////////////TASK-5/////////////////
    public static int averageOfEdges(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max + min) / 2;
    }

    /////////////////TASK-6/////////////////
    public static String[] noA(String[] arr){
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a")) result[i] = "###";
            else result[i] = arr[i];
        }
        return result;
    }

    /////////////////TASK-7/////////////////
    public static int[] no3or5(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 15 == 0) result[i] = 101;
            else if(nums[i] % 5 == 0) result[i] = 99;
            else if(nums[i] % 3 == 0) result[i] = 100;
            else result[i] = nums[i];
        }
        return result;
    }

    /////////////////TASK-8/////////////////
    public static int countPrimes(int[] nums){
        return (int)Arrays.stream(Arrays.stream(nums).toArray()).filter(
                n -> n == 2 || n == 3 || n != 1 && n % 2 != 0 && n % 3 != 0
                ).count();
    }






    public static void main(String[] args) {
        System.out.println("----------Task-1----------");

        String str = "";
        System.out.println(noSpace(str));
        str = "Java";
        System.out.println(noSpace(str));
        str = "    Hello    ";
        System.out.println(noSpace(str));
        str = " Hello World   ";
        System.out.println(noSpace(str));
        str = "Tech Global";
        System.out.println(noSpace(str));

        System.out.println("----------Task-2----------");

        str = "";
        System.out.println(replaceFirstLast(str));
        str = "A";
        System.out.println(replaceFirstLast(str));
        str = "    A       ";
        System.out.println(replaceFirstLast(str));
        str = "Hello";
        System.out.println(replaceFirstLast(str));
        str = "Tech Global";
        System.out.println(replaceFirstLast(str));

        System.out.println("----------Task-3----------");

        str = "";
        System.out.println(hasVowel(str));
        str = "Java";
        System.out.println(hasVowel(str));
        str = "1234";
        System.out.println(hasVowel(str));
        str = "ABC";
        System.out.println(hasVowel(str));

        System.out.println("----------Task-4----------");

        int age = 2010;
        System.out.println(checkAge(age));
        age = 2006;
        System.out.println(checkAge(age));
        age = 2050;
        System.out.println(checkAge(age));
        age = 1920;
        System.out.println(checkAge(age));
        age = 1800;
        System.out.println(checkAge(age));

        System.out.println("----------Task-5----------");

        int a = 0, b = 0, c = 0;
        System.out.println(averageOfEdges(a, b, c));
        a = 0;
        b = 0;
        c = 6;
        System.out.println(averageOfEdges(a, b, c));
        a = -2;
        b = -2;
        c = 10;
        System.out.println(averageOfEdges(a, b, c));
        a = -3;
        b = 15;
        c = -3;
        System.out.println(averageOfEdges(a, b, c));
        a = 10;
        b = 13;
        c = 20;
        System.out.println(averageOfEdges(a, b, c));

        System.out.println("----------Task-6----------");

        String[] string = new String[]{"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(string)));
        string = new String[]{"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(string)));
        string = new String[]{"apple", "appium", "ABC", "Alex", "A"};
        System.out.println(Arrays.toString(noA(string)));

        System.out.println("----------Task-7----------");

        int[] nums = new int[]{7, 4, 11, 23, 17};
        System.out.println(Arrays.toString(no3or5(nums)));
        nums = new int[]{3, 4, 5, 6};
        System.out.println(Arrays.toString(no3or5(nums)));
        nums = new int[]{10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(nums)));

        System.out.println("----------Task-8----------");

        nums = new int[]{-10, -3, 0, 1};
        System.out.println(countPrimes(nums));
        nums = new int[]{7, 4, 11, 23, 17};
        System.out.println(countPrimes(nums));
        nums = new int[]{41, 53, 19, 47, 67};
        System.out.println(countPrimes(nums));

    }

}
