package string_methods;

import java.util.Arrays;

public class _15_toCharArray_Method {
    public static void main(String[] args) {

        /*
        - return type
        - returns char array
        - static
        - doesn't take any argument
        - not overloaded
         */

        String s = "TechGlobal School"; // [T, e, c, h, G, l, o, b, a, l,  , S, c, h, o, o, l]

        System.out.println(Arrays.toString(s.toCharArray()));
    }
}
