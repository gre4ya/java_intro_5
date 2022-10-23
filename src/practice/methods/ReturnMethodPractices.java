package practice.methods;

public class ReturnMethodPractices {
    public static void main(String[] args) {

//        System.out.println(ReturnMethodPractices.findDifference(6, 9));
//        System.out.println(ReturnMethodPractices.findDifference(4, 1));
//        System.out.println(ReturnMethodPractices.findDifference(99, 23));
//
//        System.out.println(ReturnMethodPractices.findDifference(9.9, 10));
//        System.out.println(ReturnMethodPractices.findDifference(19.4, 199.5));
//        System.out.println(ReturnMethodPractices.findDifference(0.9, 16.9));

        System.out.println(ReturnMethodPractices.isIncluded("green, blue, red", "blue"));
        System.out.println(ReturnMethodPractices.isIncluded("John", "John Doe"));
        System.out.println(ReturnMethodPractices.isIncluded("John", "Blue"));

    }
    public static int findDifference(int num1, int num2){
        return Math.abs(num1 - num2);
    }
    public static double findDifference(double num1, double num2) {
        return Math.abs(num1 - num2);
    }

    public static boolean isIncluded(String s1, String s2){
        return s1.contains(s2) || s2.contains(s1);
    }



}

