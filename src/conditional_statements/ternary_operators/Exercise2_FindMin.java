package conditional_statements.ternary_operators;

public class Exercise2_FindMin {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;
        System.out.println(num1);
        System.out.println(num2);
        int min = num1 > num2 ? num2 : num1;
        System.out.println(min);


    }
}
