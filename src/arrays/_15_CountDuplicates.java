package arrays;

public class _15_CountDuplicates {
    public static void main(String[] args) {

        int[] numbers = {2, 3 , 7 , 1, 1, 7, 1};
        System.out.println(findHowManyDuplicates(numbers));
    }

    public static int findHowManyDuplicates(int[] numbers){

        String dup = "";

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                // if we already checked it then break

                if(dup.contains(numbers[i] + "")) break;

                //if we didn't check it add it in dup container

                if(numbers[i] == numbers[j]){
                    dup += numbers[j] + ",";
                }
            }
        }
        return dup.split(",").length;
    }
}
