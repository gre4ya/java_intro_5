package recursion;

public class Practice01_SumOfNumbers {
    /*
    Create a public static method called as sum
    It takes an int which is a positive number
    It returns the sum of numbers starting from 1 to given int
    5 -> 1+2+3+4+5 -> 15
     */
    // Iterative way
    public static int sum(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum += i;
        }
        return sum;
    }
    //Recursion way
    public static int sumRecursive(int a){
        if(a != 0) return a + sumRecursive(a - 1);
        return 0;
    //  if(a == 0) return 0;
    //  return a + sumRecursive(a - 1);
    }

    /*
    Create a public static method called as productRecursively
    It takes an int which is a positive number
    It returns the product of numbers starting from 1 to given int
    4 -> 24
    5 -> 1*2*3*4*5 -> 120
     */
    public static int productRecursive(int a) {
        if (a != 1) return a * productRecursive(a - 1);
        return 1;
    }
    public static String reverse(String str){
        if(str.length() < 2) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {

        System.out.println(sum(5)); // 15
        System.out.println(sum(6)); // 21
        System.out.println(sum(8)); // 36

        System.out.println(sumRecursive(5)); // 15
        System.out.println(sumRecursive(6)); // 21
        System.out.println(sumRecursive(8)); // 36

        System.out.println(productRecursive(4)); // 24
        System.out.println(productRecursive(5)); // 120

        System.out.println(reverse("Hello!"));
    }
}
