package strings;

public class StringConcatenation {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        String s3 = s1 + " " + s2; // Hello World

        System.out.println(s3);
        System.out.println("\n---------Concatenation with + operator-------\n");

        String firstName = "Andrii";
        String lastName = "Grechyn";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        System.out.println("\n--------Concatenation with concat() operator-------\n");

        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);









    }
}
