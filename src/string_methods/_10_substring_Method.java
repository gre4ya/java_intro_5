package string_methods;

public class _10_substring_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. return a String
        3. non-static
        4. it is overloaded and takes one or two int indexes
         */
        String s = "TechGlobal";

        // Get "Global"
        String s1 = s.substring(4); // from index 4 to the end
        System.out.println(s1);

        // Get "Tech"
        String s2 = s.substring(0, 4);  // from index 0 to the 4th one
        System.out.println(s2);



    }
}
