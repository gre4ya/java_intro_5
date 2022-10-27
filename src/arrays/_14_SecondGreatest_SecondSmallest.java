package arrays;

public class _14_SecondGreatest_SecondSmallest {
    public static void main(String[] args) {
    /*
    create a public static method which will take an int array,
    - find the max and min
    - second max and second min
    from that array then print them out.
    Example:
       Array -> int[] numbers = {2, 3, 7, 1, 1, 7};
    Output:
        max = 7
        second max = 3
        min = 1
        second min= 2
    */
        int[] numbers = {2, 3, 7, 1, 1, 7};
        int[] numbers2 = {10, -3, -7, 0, 0, 7, 22};
        int[] numbers3 = {10, -3, 7, 1, 22};
        secondMaxSecondMin(numbers);
        secondMaxSecondMin(numbers2);
        secondMaxSecondMin(numbers3);
    }

    public static void secondMaxSecondMin(int[] numbers){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int number : numbers) {
            if(number > max) max = number;
            if(number < min) min = number;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] < secondMin && numbers[i] > min)
                secondMin = numbers[i];
            if(numbers[i] > secondMax && numbers[i] < max)
                secondMax = numbers[i];
        }
        System.out.println("max = " + max);
        System.out.println("second max = " + secondMax);
        System.out.println("min = " + min);
        System.out.println("second min = " + secondMin);
    }
}
