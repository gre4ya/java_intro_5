package string_methods;

public class _11_startsWith_endsWith_Methods {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a boolean
        3. non-static
        4. there are overloaded methods
         */
        String s = "TechGlobal";
        System.out.println(s.startsWith("T")); // true
        System.out.println(s.startsWith("t")); // false
        System.out.println(s.startsWith("Tech")); // true
        System.out.println(s.endsWith("Global")); // true

        String city = "Chicago";
        System.out.println(s.startsWith("city")); // true
        System.out.println(s.endsWith("city")); // true
        System.out.println(s.startsWith("")); // true
        System.out.println(s.endsWith("")); // true




    }
}
