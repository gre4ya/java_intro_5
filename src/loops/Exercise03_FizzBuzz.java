package loops;

public class Exercise03_FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <=30 ; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fiz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            }
    }
}




