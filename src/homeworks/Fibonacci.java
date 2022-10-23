package homeworks;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("--------fori solution--------");

        int number = 10;

        if (number == 1) System.out.println("0");
        else if (number == 2) System.out.println("0 - 1");
        else if (number >= 3) {

            String fibonacci = "";
            long a = 0;
            long b = 1;
            long sum;

            for (int i = 1; i <= number - 2; i++) {
                sum = a + b;
                a = b;
                b = sum;
                fibonacci += sum + " - ";
            }
            System.out.println("0 - 1 - " + fibonacci.substring(0, fibonacci.length() - 3));
        }

        System.out.println("--------while solution--------");

        int j = 1;

        if (number == 1) System.out.println("0");
        else if (number == 2) System.out.println("0 - 1");
        else if (number >= 3) {

            String fibonacci = "";
            long a = 0;
            long b = 1;
            long sum = 0;

                while(j <= number - 2) {
                    sum = a + b;
                    a = b;
                    b = sum;
                    fibonacci += sum + " - ";
                    j++;
                }
                System.out.println("0 - 1 - " + fibonacci.substring(0, fibonacci.length() - 3));
        }
    }
}
