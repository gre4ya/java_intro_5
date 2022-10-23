package loops.fori_loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program that prints only even numbers from 0 to 10
         */

        for (int i = 0; i <= 10; i++){
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
