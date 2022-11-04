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
        // 0 - 1 - 1 - 2 - 3 - 5 - 8
        int first = 0;
        int second = 1;
        int sum;
        int input = 3;
        String answer = "";
        for (int i = 0; i < 2; i++) {    // i = 0      | i = 1
            answer += first + " - ";     // 0 -        | 0 - 1 -
            sum = first + second;        // 0 + 1 = 1  | 2
            first = second;              // 1          | 1
            second = sum;                // 1          | 2
        }
        System.out.println(answer.substring(0, answer.length() - 3));

        System.out.println("--------while solution--------");

        int j = 1;

        if (number == 1) System.out.println("0");
        else if (number == 2) System.out.println("0 - 1");
        else if (number >= 3) {

            String fibonacci = "";
            int a = 0;
            int b = 1;
            sum = 0;

                while(j <= number - 2) {
                    sum = a + b;
                    a = b;
                    b = sum;
                    fibonacci += sum + " - ";
                    j++;
                }
                System.out.println("0 - 1 - " + fibonacci.substring(0, fibonacci.length() - 3));
        }

        int givenNum = 10;
        int firstNum = 0;
        int secondNum = 1;
        int nextNum;

        answer = "";

        for (int k = 0; k < givenNum; k++) {
            answer += firstNum + " - ";
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        System.out.println(answer.substring(0, answer.length() - 3));

        System.out.println("===========================================");

        first = 0;
        second = 1;
        sum = 0;
        answer = "";
        int i = 0;
        while (i < input){
            answer += first + " - ";
            sum = first + second;
            first = second;
            second = sum;
            i++;
        }
        System.out.println(answer.substring(0, answer.length() - 3));
    }
}
