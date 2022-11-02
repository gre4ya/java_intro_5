package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Iterator;

public class _11_Iterator {
    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();

          foods.add("Pizza");
          foods.add("Pasta");
          foods.add("Burger");
          foods.add("Lamb chops");
          foods.add("Salad");
          foods.add("Falafel");
          foods.add("Sushi");

        Iterator<String> foodsIterator = foods.iterator();
        while(foodsIterator.hasNext()){
            String food = foodsIterator.next();
            if(food.length() == 5)
                foodsIterator.remove();
        }
        System.out.println(foods);
    }
}
