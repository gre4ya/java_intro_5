package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Ruby", "Go", "Java", "Ruby", "Java"));

//        ArrayList<String> unique = new ArrayList<>();
//        for (String language : languages) {
//            if(!unique.contains(language)) unique.add(language);
//        }
//        System.out.println(unique);

        System.out.println(new HashSet<>(languages));


        for (int i = 0, j = i + 1; i < languages.size() - 1; i++, j++) {
            //for (int j = i + 1; j < languages.size(); j++) {
                if(languages.get(i).equals(languages.get(j))) {
                    languages.remove(languages.get(j));
                   j--;
            }
        }
        System.out.println(languages);
    }
}
