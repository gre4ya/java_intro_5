package practice.methods;

public class VoidMethodPractices {
    public static void main(String[] args) {

//        VoidMethodPractices.flavorTaker("chocolate");
//        VoidMethodPractices.flavorTaker("Chocolate");
//        VoidMethodPractices.flavorTaker("strawberry");

//        VoidMethodPractices.checkAge(19);
//        VoidMethodPractices.checkAge(21);
//        VoidMethodPractices.checkAge(25);
//        VoidMethodPractices.checkAge(-25);

        VoidMethodPractices.checkCreditScore(129);
        VoidMethodPractices.checkCreditScore(999.99);
        VoidMethodPractices.checkCreditScore(-1);
        VoidMethodPractices.checkCreditScore(2999);
        VoidMethodPractices.checkCreditScore(0);

    }
    public static void flavorTaker(String flavor){
//        if(flavor.equals("chocolate")) System.out.println("You have a great taste");
//        else if(flavor.equals("vanilla")) System.out.println("Not bad");
//        else if(flavor.equals("strawberry")) System.out.println("Enjoy it!");
//        else System.out.println("give me a valid flavor");

        switch (flavor){
            case "chocolate":
                System.out.println("You have a great taste");
                break;
            case "vanilla":
                System.out.println("Not bad");
                break;
            case "strawberry":
                System.out.println("Enjoy it!");
                break;
            default:
                System.out.println("give me a valid flavor");
        }
    }

    public static void checkAge(int age){
        if(age>=0 && age <=19) System.out.println("You are teenager");
        else if(age == 20 || age == 21) System.out.println("You can drive");
        else if(age > 21) System.out.println("You can drink coke ") ;
        else System.out.println("Enter a valid age");
    }

    public static void checkCreditScore(double balance){
        if(balance >= 0.0 && balance <= 999.99) System.out.println("Low credit score");
        else if (balance >= 1000.0 && balance <= 1999.99) System.out.println("Medium credit score");
        else if (balance >= 2000.0 && balance <= 2999.99) System.out.println("Good credit score");
        else System.out.println("No valid credit score");
    }




}


