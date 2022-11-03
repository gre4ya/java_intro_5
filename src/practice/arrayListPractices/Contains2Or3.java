package practice.arrayListPractices;

import utilities.RandomNumberGenerator;

import java.util.ArrayList;

public class Contains2Or3 {
    public static void main(String[] args) {

        System.out.println("Contains 2 or 3");
        System.out.println(isContaining2Or3());

        System.out.println("Contains 7 or 13");
        System.out.println(isContaining7Or13());
    }
    /*
    create a public static method which generate 5 numbers between 1-10 (both included)
    then store all of them inside of an arrayList and return true if it is containing
    "2" or "3".

    Examples:
    [0, -4, -7, 0, 5] -> false
    [0, 2, -7, 0, 5] -> true
    [0, -4, -7, 0, 3] -> true
    [0, 2, -7, 0, 3] -> true
     */
    public static boolean isContaining2Or3 (){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(RandomNumberGenerator.getARandomNumber(1,10));
        }
        System.out.println(numbers);
        return numbers.contains(2) || numbers.contains(3);
    }

      /*
      create a public static method which generate 7 numbers between -20 to 20 (both included)
      then store all of them inside an arrayList and return true if it is containing
      "7" or "13".
       */
    public static boolean isContaining7Or13 (){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            numbers.add(RandomNumberGenerator.getARandomNumber(-20,20));
        }
        System.out.println(numbers);
        return numbers.contains(7) || numbers.contains(13);
    }


}
