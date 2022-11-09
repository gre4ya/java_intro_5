package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _05_containsAll_retainsAll_Method {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();

        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");

        /*
        Check if the countries ArrayList contains Spain
        Print true if it contains, and false otherwise

        EXPECTED:
        true
         */

        System.out.println(countries.contains("Spain"));
        // System.out.println(countries.indexOf("Spain") != -1);

        /*
        Check if the countries ArrayList contains Sweden and Denmark
        Print true if it contains, and false otherwise

        EXPECTED:
        false
         */
        System.out.println(countries.contains("Sweden") && countries.contains("Denmark"));

        /*
        Check if the countries ArrayList contains Sweden, Spain, Germany, Portugal, Italy
        Print true if it contains, and false otherwise

        EXPECTED:
        true
         */

        ArrayList<String> europeCountries = new ArrayList<>();

        europeCountries.add("Sweden");
        europeCountries.add("Spain");
        europeCountries.add("Germany");
        europeCountries.add("Portugal");
        europeCountries.add("Italy");

        System.out.println(countries.containsAll(europeCountries));

        countries.retainAll(europeCountries);

        System.out.println(countries); // [Italy, Germany, Spain, Portugal, Sweden]

    }
}
