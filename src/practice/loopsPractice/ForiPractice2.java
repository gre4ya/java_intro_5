package practice.loopsPractice;

public class ForiPractice2 {
    public static void main(String[] args) {

        System.out.println("\n---Hardcoded---\n");

        System.out.println("Number: " + "1");
        System.out.println("Number: " + "2");
        System.out.println("Number: " + "3");
        System.out.println("Number: " + "4");
        System.out.println("Number: " + "5");

        System.out.println("\n---Fori number counter v1---\n");

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Number: " + i);

        }

        System.out.println("\n---Fori number counter v2---\n");

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Number: " + (i + 1));

        }
    }
}
