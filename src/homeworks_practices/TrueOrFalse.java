package homeworks_practices;

public class TrueOrFalse {
    public static void main(String[] args) {

        int a1 = (int)(Math.random() * 101);
        int a2 = (int)(Math.random() * 101);
        int a3 = (int)(Math.random() * 101);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1 > 25 && a2 > 25 && a3 > 25);
        // prints true if all conditions true, prints false otherwise

    }
}
