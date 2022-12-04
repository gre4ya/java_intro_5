package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

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
        Arrays.sort(nums);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        if (nums.length > 1) {
            for (Integer num : nums) {
                numbers.add(num);
            }
            for (int i = 0; i < numbers.size() - 1; i++) {
                for (int j = i + 1; j < numbers.size() - 1; j++) {
                    if (numbers.get(i).equals(numbers.get(j)) && !numbers2.contains(numbers.get(i))) {
                        numbers2.add(numbers.get(i));
                        break;
                    }
                }
            }
            numbers.retainAll(numbers2);
            return numbers.get(0);
        }
        return nums[0];
    }

    /////////////////TASK-3/////////////////
    public static char findFirstUniqueCharacter(String str){
        char[] chars = str.toCharArray();
        String duplicates = "";
        char result = ' ';
        for (int i = 1; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if(chars[i] != chars[j] && !duplicates.contains(String.valueOf(chars[i]))) result = chars[i];
                else {
                    duplicates += chars[i];
                    break;
                }
            }
        }
        if(duplicates.isEmpty()) return ' ';
        return result;
    }

    /////////////////TASK-4/////////////////
    public static int findMissingNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(Math.abs(nums[i] - nums[i+1]) == 2) return nums[i] + 1;
        }
        return 0;
    }



    public static void main(String[] args) {

        System.out.println("----------Task-1----------");

        int[] nums = new int[]{4};
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
