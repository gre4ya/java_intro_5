package utilities;

public class RandomNumberGenerator {

    public static long getARandomNumber(long o1, long o2) {
        return (long) (Math.random() * (Math.abs(o1 - o2) + 1)) + Math.min(o1, o2);

    }

    public static int getARandomNumber(int i1, int i2) {
        return (int) (Math.random() * (Math.abs(i1 - i2) + 1)) + Math.min(i1, i2);


    }
}