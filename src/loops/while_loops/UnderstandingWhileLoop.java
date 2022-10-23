package loops.while_loops;

public class UnderstandingWhileLoop {
    public static void main(String[] args) {
        // print numbers 1 to 10
        System.out.println("-------fori loop-------");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("-------while loop-------");
        int start = 1;
        while(start <=10){
            System.out.println(start);
            start++;
        }
    }
}
