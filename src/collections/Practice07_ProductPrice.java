package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Practice07_ProductPrice {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("iPhone", 1000);
        products.put("Macbook Pro", 1300);
        products.put("iMac", 1500);
        products.put("AirPods", 200);
        products.put("iPad", 700);

        int maxPrice = new TreeSet<>(products.values()).last();
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if(entry.getValue() == maxPrice) System.out.println(entry.getKey() +
                    " is the most expencive with the price of $" + entry.getValue());
        }
    }
}
