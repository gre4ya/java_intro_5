package collections;

import java.util.HashMap;

public class _06_Maps_Methods {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");
        System.out.println(capitals); // {France=Paris}

        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");
        System.out.println(capitals); // {Italy=Rome, France=Paris, Germany=Berlin, Spain=Madrid}

        System.out.println("------retrieve values with the keys------");
        System.out.println(capitals.get("Spain")); // Madrid
        System.out.println(capitals.get("Belgium")); // null
        System.out.println(capitals.getOrDefault("Belgium", "Does not exist")); // Does not exist

        System.out.println("--------check if map contains given key or value----------");
        System.out.println(capitals.containsKey("Germany")); // true
        System.out.println(capitals.containsKey("Portugal")); // false

        System.out.println(capitals.containsValue("Ankara")); // false
        System.out.println(capitals.containsValue("Berlin")); // true

        System.out.println("--------update the value for the specified key-----------");
        System.out.println(capitals.replace("Ukraine", "Kyiv")); // null
        System.out.println(capitals.replace("Germany", "berlin", "Munich")); // false
        System.out.println(capitals.replace("Germany", "Berlin", "Munich")); // true

        capitals.put("Turkey", "Ankara");
        System.out.println(capitals); // {Turkey=Ankara, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

        capitals.put("Turkey", "Istanbul");
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

    }
}
