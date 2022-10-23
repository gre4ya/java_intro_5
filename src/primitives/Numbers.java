package primitives;

import sun.awt.geom.AreaOp;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("\n-------------Numbers - byte-short-int-long----------------\n");
        /*
        There are 6 primitives used to store numbers as data
        byte, short, int, long -> used for absolute numbers like 10
        float, double -> used for floating numbers like 10.5
        byte  -> 1 byte 127 to (-128)
        short -> 2 bytes 32767 to (-32768)
        int   -> 4 bytes 2147483647 to (-2147483648)
        long  -> 8 bytes (need to use "L" after the number)
         */

        // dataType variableName = value;
        byte age = 45;
        System.out.println(age);  // 45
        int favNumber = 32768;
        System.out.println(favNumber); // 32768

        /*
        Floating numbers
        float  -> 4 bytes
        double -> 8 bytes

        NOTE: Most of the case we will use double
         */
        System.out.println("\n-------------Floating Numbers - float-double----------------\n");
        float balance1 = 23.35467854758959f;
        double balance2 = 23.35467854758959;
        double price = 23.4;

        System.out.println(balance1); // 23.35468
        System.out.println(balance2); // 23.35467854758959
        System.out.println(price);    // 23.4
    }
}
