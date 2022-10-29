package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {
        /*
        Create an ArrayList to store below numbers
        10
        15
        20
        10
        20
        30

        Print the ArrayList
        Print size
        EXPECTED:
        [10, 15, 20, 10, 20, 30]
         6
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println(numbers.size());

//        while(numbers.contains(10)){
//            numbers.remove((Integer)10);
//        }
//        System.out.println(numbers);

        System.out.println("-----------contains() method-----------");
        System.out.println(numbers.contains(10));   // true
        System.out.println(numbers.contains(12));   // false
        System.out.println(numbers.contains(20));   // true
        System.out.println(numbers.contains(22));   // false

        System.out.println("-----------indexOf() method-----------");
        System.out.println(numbers.indexOf(15)); // 1
        System.out.println(numbers.indexOf(25)); // -1
        System.out.println(numbers.indexOf(20)); // 2

        System.out.println("-----------lastIndexOf() method-----------");
        System.out.println(numbers.indexOf(30)); // 5
        System.out.println(numbers.indexOf(35)); // -1
        System.out.println(numbers.indexOf(10)); // 3

        System.out.println("--------Retrieving each element with fori loop--------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("--------Retrieving each element with for each loop--------");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
