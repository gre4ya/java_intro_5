package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {
        System.out.println("--------------Task-1--------------");

        int[] numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSor(numbers);

        System.out.println("--------------Task-2--------------");

        findGreatestAndSmallest(numbers);

        System.out.println("--------------Task-3--------------");

        int[] numbers1 = {10, 5, 6, 7, 8, 5, 15, 15};
        int[] nums = {3};

        findSecondGreatestAndSmallestWithSor(numbers1);
        findSecondGreatestAndSmallestWithSor(nums);

        System.out.println("--------------Task-4--------------");

        findSecondGreatestAndSmallest(numbers1);

        System.out.println("--------------Task-5--------------");

        String[] words = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        findDuplicatedElementsInAnArray(words);

        System.out.println("--------------Task-6--------------");

        String[] classStaff = {"eraser", "pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        findMostRepeatedElementInAnArray(classStaff);
    }
     ///////////////////////Task-1////////////////////////

    public static void findGreatestAndSmallestWithSor(int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);
    }
    ///////////////////////Task-2////////////////////////

    public static void  findGreatestAndSmallest(int[] numbers){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if(number > max)
                max = number;
            if(number < min)
                min = number;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }
    ///////////////////////Task-3////////////////////////

    public static void findSecondGreatestAndSmallestWithSor(int[] numbers){

        Arrays.sort(numbers);

        if(numbers.length > 1) {

            int min = numbers[0];
            int max = numbers[numbers.length - 1];

            int secondMax = Integer.MIN_VALUE;
            int secondMin = Integer.MAX_VALUE;

            for (int number : numbers) {
                if (secondMax < number && number != max)
                    secondMax = number;
                if (secondMin > number && number != min)
                    secondMin = number;
            }
            System.out.println("Second Smallest = " + secondMin);
            System.out.println("Second Greatest = " + secondMax);
        }
        else System.out.println("Array is invalid");
    }
    ///////////////////////Task-4////////////////////////

    public static void  findSecondGreatestAndSmallest(int[] numbers){

        int smallest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > greatest)
                greatest = numbers[i];
            if(numbers[i] < smallest)
                smallest = numbers[i];
        }
        int secondGreatest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > secondGreatest && numbers[i] != greatest)
                secondGreatest = numbers[i];
            if(numbers[i] < secondSmallest && numbers[i] != smallest)
                secondSmallest = numbers[i];
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }
    ///////////////////////Task-5////////////////////////

    public static void findDuplicatedElementsInAnArray(String[] words){

        String duplicates = "";

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // if(duplicates.contains(words[i] + "")) break;
                if(words[i].equals(words[j]) && !duplicates.contains(words[i])){
                    duplicates += words[j] + "\n";
                    break;
                }
            }
        }
       System.out.println(duplicates.substring(0, duplicates.length()-1));
    }
    ///////////////////////Task-6////////////////////////

    public static void findMostRepeatedElementInAnArray(String[] classStaff){

        int index = 0, freq = 0, count = 0;

        for (int i = 0, j = i + 1; i < classStaff.length - 1; i++, j++) {
                if(classStaff[j].equals(classStaff[i])){
                    count++;
                }
                if(count >= freq) {
                    index = i;
                    freq = count;
                    count = 0;
                }
        }
        System.out.println(classStaff[index]);
    }
}
