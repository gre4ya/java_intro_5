package casting;

public class Exercise5 {
    public static void main(String[] args) {

        String s1 = "35", s2 = "10";


        System.out.println("Sum of s1 and s2 = " + (Integer.parseInt(s1)) + (Integer.parseInt(s2)) +
                "\nDifference of s1 and s2 = " + (Integer.parseInt(s1) - Integer.parseInt(s2)) +
                "\nAbsolute Difference of s1 and s2 = " + (Math.abs(Integer.parseInt(s1)) - Integer.parseInt(s1)) +
                "\nProduct of s1 and s2 = " + Integer.parseInt(s1) * Integer.parseInt(s2) +
                "\nDivision of s1 and s2 = " + Integer.parseInt(s1) % Integer.parseInt(s2) +
                "\nMinimum of s1 and s2 = " + Math.min(Integer.parseInt(s1), Integer.parseInt(s2)) +
                "\nMaximum of s1 and s2 = " + Math.max(Integer.parseInt(s1), Integer.parseInt(s2)));



    }


}
