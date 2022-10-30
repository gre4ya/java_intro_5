package projects;

import javax.xml.transform.Source;
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

        findSecondGreatestAndSmallestWithSor(numbers1);

        System.out.println("--------------Task-4--------------");

        findSecondGreatestAndSmallest(numbers1);

        System.out.println("--------------Task-5--------------");

        String[] words = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        findDuplicatedElementsInAnArray(words);

        System.out.println("--------------Task-6--------------");

        String[] classStaff = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

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

    public static void  findSecondGreatestAndSmallestWithSor(int[] numbers){
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length-1];
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            if(secondMax < numbers[i] && numbers[i] != max)
                secondMax = numbers[i];
            if(secondMin > numbers[i] && numbers[i] != min)
                secondMin = numbers[i];
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }
    ///////////////////////Task-4////////////////////////

    public static void  findSecondGreatestAndSmallest(int[] numbers){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > max)
                max = numbers[i];
            if(numbers[i] < min)
                min = numbers[i];
        }
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            if(secondMax < numbers[i] && numbers[i] != max)
                secondMax = numbers[i];
            if(secondMin > numbers[i] && numbers[i] != min)
                secondMin = numbers[i];
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }
    ///////////////////////Task-5////////////////////////

    public static void findDuplicatedElementsInAnArray(String[] words){
    String duplicates = "";
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if(duplicates.contains(words[i] + "")) break;
                if(words[i].equals(words[j]))
                    duplicates += words[j] + "\n";
            }
        }
    System.out.println(duplicates.substring(0, duplicates.length()-1));
    }
    ///////////////////////Task-6////////////////////////

    public static void findMostRepeatedElementInAnArray(String[] classStaff){
        String mostRepeated = "";
        int freq = 0;
        for (int i = 0; i < classStaff.length; i++) {
            int count = 0;
            for (int j = i + 1; j < classStaff.length; j++) {
                if(classStaff[j].equals(classStaff[i])){
                    count++;
                }
                if(count >= freq) {
                    mostRepeated = classStaff[i];
                    freq = count;
                }
            }
        }
        System.out.println(mostRepeated);
    }
}
