package arraylist_linkedlist_vectors;

import java.util.Arrays;
import java.util.LinkedList;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(10.5));
        System.out.println(numbers.indexOf(4));
        System.out.println(numbers.get(1));

        System.out.println(numbers.getFirst()); //10.5
        System.out.println(numbers.getLast()); //20.0
        System.out.println(numbers.offer(4.5));
        System.out.println(numbers.offerFirst(3.6));
        System.out.println(numbers);
        System.out.println(numbers.peek()); // retrieves the first element
        System.out.println(numbers); // [3.6, 10.5, 5.5, 20.0, 4.5]

        System.out.println(numbers.peekFirst()); // 3.6 // retrieves the first element
        System.out.println(numbers); // [3.6, 10.5, 5.5, 20.0, 4.5]

        System.out.println(numbers.pop()); // 3.6 // retrieves and removes the first element
        System.out.println(numbers); // [10.5, 5.5, 20.0, 4.5]

        System.out.println(numbers.poll()); // 10.5 // retrieves and removes the first element
        System.out.println(numbers); // [5.5, 20.0, 4.5]

        System.out.println(numbers.pollLast()); // 4.5 // retrieves and removes the last element
        System.out.println(numbers); // [5.5, 20.0]

        numbers.push(2.0); // adds number at the front of the array
        System.out.println(numbers); // [2.0, 5.5, 20.0]

    }
}
