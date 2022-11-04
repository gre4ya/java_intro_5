package arrays;

import java.util.ArrayList;

public class _15_CountDuplicates {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 7, 1, 1, 7, 1, 3, 7, 7, 7, 9, 9};
        System.out.println(findHowManyDuplicates(numbers));
        System.out.println(findHowManyDuplicates2(numbers));
    }

    public static int findHowManyDuplicates(int[] numbers) {

        String dup = "";

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!dup.contains(numbers[i] + "") && numbers[i] == numbers[j])
                    dup += numbers[j] + "";
            }
        }
        return dup.length();
    }

    public static int findHowManyDuplicates2(int[] numbers) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!nums.contains(numbers[i]) && numbers[i] == numbers[j])
                    nums.add(numbers[j]);
            }
        }
        return nums.size();
    }
}