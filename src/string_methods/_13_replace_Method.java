package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a String
        3. non-static
        4. there are overloaded methods, one takes 2 chars to be replaced
           and the other takes two strings to be replaced
         */

        String s = "Can I can a can";
        String s1 = s.replace('c', 'x');

        System.out.println(s1); // Can I xan a xan

        System.out.println(s.replace("can", "xxx")); // Can I xxx a xxx
        System.out.println(s.toLowerCase().replace("can", "xxx")); // xxx i xxx a xxx

        String str1 = "John";
        System.out.println(str1.replace("o", "ooo"));

        String str2 = "apple";
        System.out.println(str2.replace("abc", "xyz")); // nothing happens

        String str3 = "orange";
        System.out.println(str3.replace(str3, "")); // replace with empty string

    }
}
