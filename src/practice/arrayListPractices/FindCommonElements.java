package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {
    public static void main(String[] args) {

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(10, 20, 20, 30, 50, 70));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(20, 50, 70, 100, 300));
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(30, 50, 70));
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(20, 100, 300));

        commonElementsInTwoArrayLists(numbers1, numbers2);
        commonElementsInTwoArrayLists(numbers3, numbers4);



    }


    /*
    Create a public static method which will take two arraylists, and it will find the common
    elements between them then print it

    Test data 1:
        numbers1 = {10, 20, 30, 50, 70};
        numbers2 = {20, 50, 70, 100, 300};
    Expected output 1:
        20
        50
        70

    Test data 2:
       numbers1 = {30, 50, 70};
       numbers2 = {20, 100, 300};

    Expected output 2:
        There is no matching elements
     */
    public static void commonElementsInTwoArrayLists(ArrayList<Integer> numbers1, ArrayList<Integer> numbers2){
        ArrayList<Integer> commons = new ArrayList<>();
        for (int i = 0; i < numbers1.size(); i++) {
            for (int j = 0; j < numbers2.size(); j++) {
                if (numbers1.get(i).equals(numbers2.get(j)) && !commons.contains(numbers1.get(i)))
                    commons.add(numbers1.get(i));
            }
        }
        if(commons.isEmpty()) System.out.println("There is no matching elements");
        else commons.forEach(System.out::println);
    }
}
