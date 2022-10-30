package homeworks;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Collection;
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




    }

}
