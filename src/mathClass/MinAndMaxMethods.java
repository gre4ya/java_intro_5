package mathClass;

public class MinAndMaxMethods {
    public static void main(String[] args) {

        int maxNumber = Math.max(80, 27);
        System.out.println("Maximum of two numbers is " + maxNumber);// 80
        int maxNumber2 = Math.max(maxNumber, 125);
        System.out.println("New maximum of two numbers is " + maxNumber2); // 125

        System.out.println("----------------------------------------");

        int minNumber = Math.min(80, 27);
        int minNumber2 = Math.min(minNumber, 2);
        int minOgTwoNeg = Math.min(-40, -60);
        System.out.println("Minimum of two numbers is " + minNumber); // 27
        System.out.println("New minimum of two numbers is " + minNumber2); // 2
        System.out.println("Minimum of two negative numbers is " + minOgTwoNeg); // -60

        System.out.println("----------------------------------------");

        double maxOfTwoDecimals = Math.max(1.7, 6.5);
        System.out.println("Max of two decimals is " + maxOfTwoDecimals); // 6.5
        double maxOfTwoDecimalsNeg = Math.max(-5.4, -27.2); // -5.4
        System.out.println("Max of two negative decimals is " + maxOfTwoDecimalsNeg); // 6.5

        System.out.println("-------------------Next Task-----------------");

        System.out.println("Max is " + Math.max(6, 9));
        System.out.println("Max is " + Math.max(17, 49));
        System.out.println("Max is " + Math.max(34.2, 12.5));
        System.out.println("Max is " + Math.max(-14, -32));
        System.out.println("Max is " + Math.max(Math.max(17, 49), 125));

        System.out.println("-------------------Next Task-----------------");

        System.out.println("min is " + Math.min(6, 9));
        System.out.println("min is " + Math.min(17, 49));
        System.out.println("min is " + Math.min(34.2, 12.5));
        System.out.println("min is " + Math.min(-14, -32));
        System.out.println("min is " + Math.min(Math.min(17, 49), 125));
        System.out.println("min is " + Math.min(Math.min(Math.min(45, 32), 56), 89));

        System.out.println("-------------------Next Task-----------------");









    }
}
