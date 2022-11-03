package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("-----------Task-1-----------");

        ArrayList<Integer> numbers = new ArrayList<>();
          numbers.add(10);
          numbers.add(23);
          numbers.add(67);
          numbers.add(23);
          numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("-----------Task-2-----------");

        ArrayList<String> colours = new ArrayList<>();
          colours.add("Blue");
          colours.add("Brown");
          colours.add("Red");
          colours.add("White");
          colours.add("Black");
          colours.add("Purple");

        System.out.println(colours.get(1));
        System.out.println(colours.get(3));
        System.out.println(colours.get(5));
        System.out.println(colours);

        System.out.println("-----------Task-3-----------");

        ArrayList<Integer> nums = new ArrayList<>();
          nums.add(23);
          nums.add(-34);
          nums.add(-56);
          nums.add(0);
          nums.add(89);
          nums.add(100);

        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("-----------Task-4-----------");

        ArrayList<String> cities = new ArrayList<>();
          cities.add("Istanbul");
          cities.add("Berlin");
          cities.add("Madrid");
          cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("-----------Task-5-----------");

        ArrayList<String> marvelHeroes = new ArrayList<>();
          marvelHeroes.add("Spider Man");
          marvelHeroes.add("Iron Man");
          marvelHeroes.add("Black Panter");
          marvelHeroes.add("Deadpool");
          marvelHeroes.add("Captain America");

        System.out.println(marvelHeroes);
        System.out.println(marvelHeroes.contains("Wolwerine"));

        System.out.println("-----------Task-6-----------");

        ArrayList<String> avengers = new ArrayList<>();
          avengers.add("Hulk");
          avengers.add("Black Widow");
          avengers.add("Captain America");
          avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("-----------Task-7-----------");

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));

        System.out.println(characters);
        for (Character character : characters) {
            System.out.println(character);
        }

        System.out.println("-----------Task-8-----------");

        ArrayList<String> officethings = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));

        System.out.println(officethings);
        Collections.sort(officethings);
        System.out.println(officethings);

        int countM = 0;
        int countAE = 0;

        for (String item : officethings) {
            if(item.toLowerCase().startsWith("m")) countM++;
            if(!item.toLowerCase().contains("a") && !item.toLowerCase().contains("e")) countAE++;
        }
        System.out.println(countM);
        System.out.println(countAE);

        System.out.println("-----------Task-9-----------");

        ArrayList<String> kitchenStaff = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));

        System.out.println(kitchenStaff);
        int upper = 0, lower = 0, hasP = 0, startsOrEndsP = 0;

        for (String s : kitchenStaff) {
            if(Character.isUpperCase(s.charAt(0))) upper++;
            else lower++;
            if (s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")) {
                hasP++;
                startsOrEndsP++;
                }
            else if(s.toLowerCase().contains("p"))
                hasP++;

        }
        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending with P or p = " + startsOrEndsP);

        System.out.println("-----------Task-10-----------");

        ArrayList<Integer> newNumbers = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        int dev10 = 0, evenGreater15 = 0, oddLess20 = 0, less15greater50 = 0;
        System.out.println(newNumbers);
        for (Integer newNumber : newNumbers) {
            if (newNumber % 10 == 0) dev10++;
            if (newNumber % 2 == 0 && newNumber > 15) evenGreater15++;
            if (newNumber % 2 != 0 && newNumber < 20) oddLess20++;
            if (newNumber < 15 || newNumber > 50) less15greater50++;
        }

//        dev10 = 0; evenGreater15 = 0; oddLess20 = 0; less15greater50 = 0;
//
//        for (Integer newNumber : newNumbers) {
//            if(newNumber % 2 == 0){
//                if(newNumber > 15) evenGreater15++;
//                if(newNumber % 10 == 0) dev10++;
//            }
//            else if(newNumber < 20) oddLess20++;
//            if (newNumber < 15 || newNumber > 50) less15greater50++;
        //}
       // dev10 = 0; evenGreater15 = 0; oddLess20 = 0; less15greater50 = 0;



        System.out.println("Elements that can be divided by 10 = " + dev10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreater15);
        System.out.println("Elements that are odd and less than 20 = " + oddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15greater50);
        System.out.println("==================================================================");

        System.out.println("Elements that can be divided by 10 = " + newNumbers.stream().filter(x -> x % 10 == 0).count());
        System.out.println("Elements that are even and greater than 15 = " + newNumbers.stream().filter(x -> x % 2 == 0 & x > 15).count());
        System.out.println("Elements that are odd and less than 20 = " + newNumbers.stream().filter(x -> x % 2 != 0 & x < 20).count());
        System.out.println("Elements that are less than 15 or greater than 50 = " + newNumbers.stream().filter(x -> x < 15 | x > 50).count());



    }
}
