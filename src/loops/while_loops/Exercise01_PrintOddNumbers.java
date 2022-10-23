package loops.while_loops;

public class Exercise01_PrintOddNumbers {
    public static void main(String[] args) {
        int number = 1;
        while(number <= 10){
            if(number % 2 == 1) System.out.println(number);
            number++;
        }
    }
}
