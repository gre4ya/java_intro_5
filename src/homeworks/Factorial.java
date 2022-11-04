package homeworks;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("\n-----------for-i-solution------------\n");

        int input = 9;
        int factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + input + " is = " + factorial);

        System.out.println("\n-----------while-solution------------\n");

        factorial = 1;
        int i = 1;
        while (i <= input){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + input + " is = " + factorial);

        System.out.println("\n------------do-while-solution------------\n");

        factorial = 1;
        i = 1;

        do {
            factorial *= i;
            i++;
        }
        while (i <= input);
        System.out.println("Factorial of " + input + " is = " + factorial);
    }
}