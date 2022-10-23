package operators.shorthand_assignment_operators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        double balance, firstTransaction, secondTransaction, thirdTransaction;

        System.out.println("Hey user, please enter your balance: ");
        balance = inputReader.nextDouble();

        System.out.println("Now, please tell your first transaction");
        firstTransaction = inputReader.nextDouble();

        balance -= firstTransaction;
        System.out.println("Balance after 1st transaction = $" + balance);

        System.out.println("Now, please tell your second transaction");
        secondTransaction = inputReader.nextDouble();

        balance -= secondTransaction;
        System.out.println("Balance after 2nd transaction = $" + balance);

        System.out.println("Now, please tell your third transaction");
        thirdTransaction = inputReader.nextDouble();

        balance -= thirdTransaction;
        System.out.println("Balance after 3d transaction = $" + balance);


    }
}
