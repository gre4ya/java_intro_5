package arrays;

public class DeclaringArray {
    public static void main(String[] args) {

        //Declare an array

        String[] countries;
        int[] numbers;
        char[] characters;
        double[] doubles;
        boolean[] booleans;

        //Initialization - Assignment with size only

        countries = new String[3];
        numbers = new int[4];
        characters = new char[4];
        doubles = new double[4];
        booleans = new boolean[4];

        System.out.println(countries[0]); // null - it is default for String, Objects, Integer-Doubles
        System.out.println(numbers[0]); // 0 - it is default for byte-short-int-long
        System.out.println(characters[0]); // nothing
        System.out.println(doubles[0]); // 0.0 - it is default for double & float
        System.out.println(booleans[0]); // false

    }
}
