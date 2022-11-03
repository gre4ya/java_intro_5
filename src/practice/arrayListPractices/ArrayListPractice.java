package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {

        /*
        1. Create an arraylist and assign 5 numbers
            example: [1, 2, 3, 4, 5]
        2. Create a loop which will replace every number "2" with 7
            example: [1, 7, 3, 4, 5]
        3. Remove if the number is divisible by 2
            example: [1, 7, 3, 5]
        NOTE: Use iterator.
        4. As the last step add three "10" in the end
         */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("1." + numbers);
        int j = 0;
        for (Integer number : numbers) {
            if(number == 2) numbers.set(j, 7);
            j++;
        }
        System.out.println("2." + numbers);
        Iterator<Integer> newNumbers = numbers.iterator();

        while(newNumbers.hasNext()){
            Integer n = newNumbers.next();
            if(n % 2 == 0)
                newNumbers.remove();
        }
        System.out.println("3." + numbers);
        for (int i = 0; i < 3; i++) {
            numbers.add(10);
        }
        System.out.println("4." + numbers);
    }
}
