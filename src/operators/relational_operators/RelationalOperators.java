package operators.relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 5, b = 10;

        System.out.println(a < b); //true
        System.out.println(a <= b); //true
        System.out.println(a != b); //true
        System.out.println(( a + a ) == b); //true
        System.out.println(4 * a == 2 * b); //true

        System.out.println(true == true); //true
        System.out.println(true == false); //false
        System.out.println(true != false); //true

        System.out.println((3 < 5) == (10 > 2)); //true
        System.out.println((1 + 5 + 10) == (2 * 8)); //true
        System.out.println((10 * 2 / 4 + 6) == (24 / 2 + 1) != (7 * 3 - 10) < (3 * 3 * 3)); //true


        int num1 = 10;
        int num2 = 3;
        boolean b1 = num1 < num2;

        System.out.println("The " + b1);

        System.out.println((3 * 5 + 1) != 8 * 2 != (17 - 7) * 5 > 100); //false

    }
}
