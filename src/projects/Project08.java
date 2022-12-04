package projects;

import java.util.*;

public class Project08 {

    /////////////////TASK-1/////////////////
    public static int findClosestDistance(int[] nums) {

        int minDistance = Integer.MAX_VALUE;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (Math.abs(nums[i] - nums[j]) < minDistance) minDistance = Math.abs(nums[i] - nums[j]);
                }
            }
            return minDistance;
        }
        return -1;
    }

    /////////////////TASK-2/////////////////
    public static int findSingleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    count++;
            }
            if(count == 1) return nums[i];
        }
        return -1;
    }

    /////////////////TASK-3/////////////////
    public static char findFirstUniqueCharacter(String str){

        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                return str.charAt(i);
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

        int[] nums = {4};
        System.out.println(findClosestDistance(nums));
        nums = new int[]{4, 8, 7, 15};
        System.out.println(findClosestDistance(nums));
        nums = new int[]{10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(nums));

        System.out.println("----------Task-2----------");

        nums = new int[]{2};
        System.out.println(findSingleNumber(nums));
        nums = new int[]{5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(nums));

        System.out.println("----------Task-3----------");

        String str = "Hello";
        System.out.println(findFirstUniqueCharacter(str));
        str = "abc abc d";
        System.out.println(findFirstUniqueCharacter(str));
        str = "abab";
        System.out.println(findFirstUniqueCharacter(str));

        System.out.println("----------Task-4----------");
        nums = new int[]{2, 4};
        System.out.println(findMissingNumber(nums));
        nums = new int[]{2, 3, 1, 5};
        System.out.println(findMissingNumber(nums));
        nums = new int[]{4, 7, 8, 6};
        System.out.println(findMissingNumber(nums));

    }
}
