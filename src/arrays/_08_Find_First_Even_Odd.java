package arrays;

public class _08_Find_First_Even_Odd {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        firstEvenFirstOdd(numbers);

    }

    public static void firstEvenFirstOdd(int[] numbers){
        int even = 0, odd = 0;
        boolean isEvenFound = false, isOddFound = false;
        // - array =  {0, 5, 3, 2, 4, 7, 10};
        for (int number: numbers) {
            if(!isEvenFound && number % 2 == 0){     // if first even not found and the number is even
                even = number;
                isEvenFound = true;  // marking flag as ture so next time you will know even was found
            }
            else if(!isOddFound && number % 2 == 1) {  // if first odd not found and the number is odd
                odd = number;
                isOddFound = true;   // marking flag as ture so next time you will know even was found
            }
        }
    System.out.println(isEvenFound ? "First even = " + even : "There is no even numbers in the array");
    System.out.println(isOddFound ? "First odd = " + odd : "There is no odd numbers in the array");
    }
}
