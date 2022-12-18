package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Practice07_ProductPrice {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        products.put("iPhone", 1000.0);
        products.put("Macbook Pro", 1300.0);
        products.put("iMac", 1500.0);
        products.put("AirPods", 200.0);
        products.put("iPad", 700.0);

        double maxPrice = new TreeSet<>(products.values()).last();
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getValue() == maxPrice) {
                System.out.println(entry.getKey() +
                        " is the most expencive with the price of $" + entry.getValue());
                break;
            }
        }
    }
}
