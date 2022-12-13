package recursion;

public class UnderstandingRecursion {

    public static void print(){
        System.out.println("Hello!");
        print(); // StackOverflowError
    }
    public static void printNumbersRecursively(int num){
        if(num == 0) return;
        printNumbersRecursively(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        //  print();  // StackOverflowError
        printNumbersRecursively(6);
    }
}
