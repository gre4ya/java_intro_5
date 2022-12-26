package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("---------------Task-1---------------");

        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));

        System.out.println("---------------Task-2---------------");

        System.out.println(noZero(new ArrayList<Integer>(Arrays.asList(1))));
        System.out.println(noZero(new ArrayList<Integer>(Arrays.asList(1, 1, 10))));
        System.out.println(noZero(new ArrayList<Integer>(Arrays.asList(0, 1, 10))));
        System.out.println(noZero(new ArrayList<Integer>(Arrays.asList(0, 0, 0))));

        System.out.println("---------------Task-3---------------");

        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));

        System.out.println("---------------Task-4---------------");

        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));

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
        boolean result = false;
        for (String s : arr) {
            if(s.equals(str)){
                result = true;
                break;
            }
        }
        return result;
    }
    ///////////////////////Task-5///////////////////////

}
