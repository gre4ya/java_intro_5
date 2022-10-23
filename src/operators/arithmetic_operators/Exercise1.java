package operators.arithmetic_operators;

public class Exercise1 {
    public static void main(String[] args) {

        int num1 = 4, num2 = 7;
        System.out.println("Area of the rectangle is = " + (num1 * num2) +
                " and the perimeter is = " + ((num1 + num2) * 2)  );

        int shortSide = 4, longSide = 7;
        System.out.println("Area is = " + shortSide * longSide);
        System.out.println("Perimeter is = " + ((shortSide + longSide) * 2));
    }
}
