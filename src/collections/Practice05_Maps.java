package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice05_Maps {
    public static void main(String[] args) {
        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        // Keys: Day, Color, City, Car, Pet
        // Values: Friday, Black, Chicago, Lexus, Turtle

        /*
        Get keys and print them
        [Car, Color, City, Day, Pet]
         */

        //HashSet<String> keys = new HashSet<>(favorites.keySet());
        System.out.println(new HashSet<>(favorites.keySet()));
        // HashSet<String> values = new HashSet<>(favorites.values());
        new HashSet<>(favorites.values()).forEach(System.out::println);

        Set<Map.Entry<String, String>> entries = favorites.entrySet();

        int i = 1;
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(i++ + ". key = " + entry.getKey() + " and the value for it = " + entry.getValue());
        }

    }
}
