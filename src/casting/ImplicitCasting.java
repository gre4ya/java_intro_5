package casting;

public class ImplicitCasting {
    public static void main(String[] args) {

        // implicit casting - widening - upcasting

        byte b = 25; // -128, 127
        int i = b;
        System.out.println(i); //25

        float f = 10.5f;
        double d = f;
        System.out.println(d); // 10.5





    }

    public static class PrimitivesToString {
        public static void main(String[] args) {

            int num1 = 5, num2 = 10;
            System.out.println(num1 + num2); // 15 primitive (number)
            System.out.println("" + num1 + num2); // 510 (string)
            System.out.println(' ' + num1 + num2); // 47 primitive (number)
            System.out.println("" + (num1 + num2)); // 15 (string)
            System.out.println(String.valueOf(num1) + String.valueOf(num2)); // "5" + "10" -> 510 (string)





        }
    }
}
