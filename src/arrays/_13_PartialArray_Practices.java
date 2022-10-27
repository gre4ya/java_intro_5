package arrays;

public class _13_PartialArray_Practices {
    public static void main(String[] args) {
        /*
        create a public static method which will take an int array then it will get the
        sum of first 3 elements and return it. Note: Given array should be at least 3 elements
        Example:
        Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        Return:
        0
        Example2:
        Array -> int[] numbers = {10, -3, 7, 1, 22};
        Return2:
        14
         */
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        int[] numbers2 = {10, -3, 7, 1, 22};
        System.out.println(sumOfFirstThreeNums(numbers));
        System.out.println(sumOfFirstThreeNums(numbers2));
        /*
        create a public static method which will take an int array then it will get the
        sum of last 5 elements and return it.
        Note: Given array should be at least 5 elements
        Note2: Use LOOPS
        Example:
        Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        Return:
        22
        Example2:
        Array -> int[] numbers = {10, -3, 7, 1, 22};
        Return2:
        38
         */
        int[] numbers3 = {10, -3, -7, 0, 0, 7, 22};
        int[] numbers4 = {10, -3, 7, 1, 22};

        System.out.println(sumOfLastFiveNums(numbers3));
        System.out.println(sumOfLastFiveNums(numbers4));


    }


    public static int sumOfFirstThreeNums(int[] nums){
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int sumOfLastFiveNums(int[] nums){
        int sum = 0;
        for (int i = nums.length - 1; i >= nums.length - 5; i--) {
            sum += nums[i];
        }
        return sum;
//      for (int i = nums.length - 5; i < nums.length; i++) {
//          sum += nums[i];
    }




}
