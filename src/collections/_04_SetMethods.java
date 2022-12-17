package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _04_SetMethods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Foo");
        set.add("Bar");
        set.add("bar");
        set.add("foo");
        set.add("abc");
        set.add("xxx");

        System.out.println(set); // [Bar, bar, abc, Foo, foo, xxx]
        System.out.println(set.size()); // 6
        System.out.println(set.isEmpty()); // false
        System.out.println(set.contains("ABC")); // false
        System.out.println(set.contains("abc")); // true
        System.out.println(set.remove("AAA")); // false
        System.out.println(set.remove("xxx")); // true
        System.out.println(set); // [Bar, bar, abc, Foo, foo]
        System.out.println(set.equals(set)); // ture
        set.removeIf(e -> e.toLowerCase().startsWith("b"));
        System.out.println(set); // [abc, Foo, foo]
        set.forEach(System.out::println);
        System.out.println();

        Iterator<String> it = set.iterator();
        while(it.hasNext()) System.out.println(it.next());

        set.removeAll(set);
        set.clear();
        System.out.println(set.size()); // 0
        System.out.println(set); // []

    }
}
