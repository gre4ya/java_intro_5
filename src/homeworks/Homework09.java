package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("-----------Task-1-----------");

        //int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        //int[] numbers = {-8, 56, 7, 8, 65};
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        ArrayList<Integer> numberList = new ArrayList<>();
        for (Integer number : numbers) {
            if(numberList.contains(number)) {
                System.out.println(number);
                break;
            }
                else numberList.add(number);

        }


        boolean isFound = false;
        /*
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !isFound) {
                    isFound = true;
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
        if(!isFound) System.out.println("There is no duplicates");
         */

        System.out.println("-----------Task-2-----------");

        //String[] words = {"Z", "abc", "z", "123", "#" };
        //String[] words = {"xyz", "java", "abc"};
        String[] words = {"a", "b", "B", "XYZ", "123"};
        isFound = false;
        StringBuilder duplicate = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !isFound) {
                    duplicate.append(words[i]);
                    isFound = true;
                    break;
                }
            }
        }
        System.out.println(isFound ? duplicate : "There is no duplicates");

        System.out.println("-----------Task-3-----------");

        int[] newNumbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        //int[] newNumbers = {1, 2, 5, 0, 7};
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < newNumbers.length - 1; i++) {
            for (int j = i + 1; j < newNumbers.length; j++) {
                if (newNumbers[i] == newNumbers[j] && !nums.contains(newNumbers[i])) {
                    nums.add(newNumbers[i]);
                    System.out.println(newNumbers[i]);
                }
            }
        }

        if(nums.isEmpty()) System.out.println("There is no duplicates");
       // else nums.forEach(System.out::println);

        System.out.println("-----------Task-4-----------");

        String[] newWords = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        //String[] newWords = {"python", "foo", "bar", "java", "123"};

        String newDuplicate = "";

        for (int i = 0; i < newWords.length - 1; i++) {
            for (int j = i + 1; j < newWords.length; j++) {
                if (newWords[i].equalsIgnoreCase(newWords[j]) &&
                        !newDuplicate.contains(newWords[i].toLowerCase())) {

                    newDuplicate += newWords[i].toLowerCase();
                    System.out.println(newWords[i]);

                }
            }
        }
        if(newDuplicate.isEmpty()) System.out.println("There is no duplicates");

        System.out.println("-----------Task-5-----------");

        //String[] words1 = {"abc", "foo", "bar"};
        //String[] words1 = {"java", "python", "ruby"};
        String[] words1 = {"java", "python", "ruby", "cat", "' '", "apple", "A"};
        int firstIndex = 0;
        int lastIndex = words1.length - 1;
        String storage;
        while(firstIndex < lastIndex){
            storage = words1[firstIndex];
            words1[firstIndex] = words1[lastIndex];
            words1[lastIndex] = storage;
            firstIndex++;
            lastIndex--;
        }
        System.out.println(Arrays.toString(words1));

        /*
        Collections.reverse(Arrays.asList(words1));
        System.out.println(Arrays.toString(words1));

        System.out.println("----------------------------");

        String[] reverse = new String[words1.length];
        for (int i = words1.length - 1; i >= 0; i--) {
            reverse[words1.length - 1 - i] = words1[i];
        }
        System.out.println(Arrays.toString(reverse));
        */

        System.out.println("-----------Task-6-----------");

        //String str = "Java is fun";
        String str = "Today is a fun day";
        StringBuilder result = new StringBuilder();
        String[] str1 = str.split("[ ]+");
        for (String s : str1) {
            result.append(new StringBuilder(s).reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
