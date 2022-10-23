package string_methods;

import java.util.Arrays;

public class _16_splitMethod {
    public static void main(String[] args) {
        /*
        - return
        - returns a string array
        - non-static
        - it takes regex (regular expression) as an argument
         */
        String s = "Today is Sunday and the weather is nice";
        String[] arr1 = s.split(" "); // [Today, is, Sunday, and, the, weather, is, nice]
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(s.split("is"))); // [Today ,  Sunday and the weather ,  nice]

    }
}
