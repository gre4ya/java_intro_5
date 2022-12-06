package projects;

import java.util.*;

public class Project08 {

    /////////////////TASK-1/////////////////
    public static int findClosestDistance(int[] nums) {

        if (nums.length > 1) {
            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 1; i++) {
               for (int j = i + 1; j < nums.length; j++) {
                    if (Math.abs(nums[i] - nums[j]) < minDistance)
                        minDistance = Math.abs(nums[i] - nums[j]);
                }
           }
            return minDistance;
        }
//---------------------------------------------------------------------------------------------------
//        if (arr.length < 2) return -1;
//          Arrays.sort(arr); // 4, 7, 8, 15
//            int smallestDiff = Integer.MAX_VALUE;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (Math.abs(arr[i] - arr[i + 1]) < smallestDiff)
//                    smallestDiff = Math.abs(arr[i] - arr[i + 1]);
//          }
//        return smallestDiff;
//---------------------------------------------------------------------------------------------------
        return -1;
    }

    /////////////////TASK-2/////////////////
    public static int findSingleNumber(int[]arr) {
//---------------------------------------------------------------------------------------------------
//        for (int j : arr) {
//            int count = 0;
//            for (int num : arr) {
//                if (j == arr)
//                    count++;
//            }
//            if (count == 1) return j;
//        }
//        return -1;
//---------------------------------------------------------------------------------------------------
//        if (arr.length == 1) return arr[0];
//        int ans = 0;
//        // if current value is not in the list, add to list and add it with our ans container. When we find
//        // a value that is already in the list, we subtract from our ans container. (the logic is same as
//        // removing from the list, and in turn, whatever is left in the list, is our unique/single number)
//        List<Integer> nums = new ArrayList<Integer>();
//        for (int j : arr) {
//            if (!nums.contains(j)) {
//                nums.add(j);
//                ans += j;
//            } else ans -= j;
//        }
//        return ans;
//---------------------------------------------------------------------------------------------------

        Arrays.sort(arr);
        // compare the next number, if it's the same, then we can skip that num
        // if it's not the same, return it
        if (arr.length == 1) return arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) return arr[i];
            else i++;
        }
        return arr[arr.length - 1];
    }

    /////////////////TASK-3/////////////////
    public static char findFirstUniqueCharacter(String s){
//---------------------------------------------------------------------------------------------------
//        for (int i = 0; i < s.length(); i++) {
//            boolean isUnique = true;
//            for (int j = 0; j < s.length(); j++) {
//                if (i != j && s.charAt(i) == s.charAt(j)) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique)
//                return s.charAt(i);
//        }
//        return ' ';
//---------------------------------------------------------------------------------------------------

        while(s.length() > 0) {
            // if the character we're looking at, exists in the rest of the string
            // remove all instances of that character, else return character
            if (s.length() == 1) return s.charAt(0);
            if (!s.substring(1).contains("" + s.charAt(0))) return s.charAt(0);
            else s = s.replaceAll("" + s.charAt(0), "");
        }
        return ' ';

    }

    /////////////////TASK-4/////////////////
    public static int findMissingNumber(int[] nums){

        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(Math.abs(nums[i] - nums[i+1]) == 2) result = nums[i] + 1;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("----------Task-1----------");

        System.out.println(findClosestDistance(new int[]{4}));
        System.out.println(findClosestDistance(new int[]{4, 8, 7, 15}));
        System.out.println(findClosestDistance(new int[]{10, -5, 20, 50, 100}));

        System.out.println("----------Task-2----------");

        System.out.println(findSingleNumber(new int[]{2}));
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 7, -1}));

        System.out.println("----------Task-3----------");

        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findFirstUniqueCharacter("abc abc d"));
        System.out.println(findFirstUniqueCharacter("abab"));

        System.out.println("----------Task-4----------");

        System.out.println(findMissingNumber(new int[]{2, 4}));
        System.out.println(findMissingNumber(new int[]{2, 3, 1, 5}));
        System.out.println(findMissingNumber(new int[]{4, 7, 8, 6}));

    }
}
