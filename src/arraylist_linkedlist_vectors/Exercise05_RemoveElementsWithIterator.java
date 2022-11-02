package arraylist_linkedlist_vectors;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {

        /*
        TASK
        Remove elements that contains "book"
        -This is case-insensitive

        Print the list -> [Pen, Pencil]
         */

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Pen","Pencil", "book", "Notebook", "MacBook Pro"));

        Iterator<String> objectsIterator = objects.iterator();
        while(objectsIterator.hasNext()){
            String object = objectsIterator.next();
            if(object.toLowerCase().contains("book"))
                objectsIterator.remove();
        }
        System.out.println(objects);
    }
}
