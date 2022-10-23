package string_methods;

public class _09_trim_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns String
        3. non-static
        4. it does not take any argument
         */
        String s1 = "  Hello   ";

        System.out.println(s1.length()); // 10
        System.out.println(s1.trim().length()); // 5
    }
}
