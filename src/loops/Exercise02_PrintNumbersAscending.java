package loops;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {
        System.out.println("------------1st way------------");

        for (int i = 1; i <= 10; i++) {
            if(i < 10)System.out.print(i + " - ");
            else System.out.print(i);
        }
        System.out.println("\n------------2nd way------------");

        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " - ";
        }
        System.out.println(result.substring(0, result.length() - 3));

    }
}
