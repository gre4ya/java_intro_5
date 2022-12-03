package homeworks_practices;

import java.util.Arrays;
import java.util.Collections;

public class CodingBadPractice {
    public static int centeredAverage(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i != maxIndex && i != minIndex) sum += nums[i]; //+6+4+8
        }
        return sum / (nums.length - 2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 100};
        int[] nums1 = {7, 7, 7};
        System.out.println(CodingBadPractice.centeredAverage(nums));
        System.out.println(CodingBadPractice.centeredAverage(nums1));

    }
}
