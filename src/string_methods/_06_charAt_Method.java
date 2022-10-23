package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a char at given index
        3. non-static
        4. takes one static as index
         */
        String sentence = "Java is fun";

        char c1 = sentence.charAt(3); // 'a'
        char c2 = sentence.charAt(4); // ' '

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(sentence.charAt(9)); // 'u'
        // NOTE: Runtime error - StringIndexOutOfBoundsException
        // System.out.println(sentence.charAt(-5)); // Runtime error
        // System.out.println(sentence.charAt(50)); // Runtime error

        System.out.println((String.valueOf(sentence.charAt(1))).toUpperCase());
        // char 'a' -(cast to String)->  String "a" -(toUpperCase)-> String "A"
    }
}
