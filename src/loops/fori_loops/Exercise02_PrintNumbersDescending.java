package loops.fori_loops;

public class Exercise02_PrintNumbersDescending {
    public static void main(String[] args) {
        /*
        Write a Java program that prints number backward from 100 to 0

        start point: 100
        end point: 0
        update: decrement
         */
        for(int i = 100; i >= 0; i--){ // (int i = 100; i != -1; i--)
            System.out.println(i);
        }
    }
}
