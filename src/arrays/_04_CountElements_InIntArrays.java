package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0 ,10, 0};

        int negatives = 0;
        int positives = 0;
        int neutrals = 0;

        for(int number : numbers){
            if(number < 0) negatives++;
            else if (number > 0) positives++;
            else neutrals++;
        }
        System.out.println("There are " + negatives + " negative numbers in the array");
        System.out.println("There are " + positives + " positive numbers in the array");
        System.out.println("There are " + neutrals + " neutral or zero numbers in the array");
    }
}
