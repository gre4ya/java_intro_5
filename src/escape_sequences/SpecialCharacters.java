package escape_sequences;

public class SpecialCharacters {
    public static void main(String[] args){
        System.out.println("apple\\orange");                    //    apple\orange
        System.out.println("apple\\\\orange");                  //    apple\\orange
        System.out.println("I like \"Sundays\" and apple");     //    I like "Sundays" and apple
        System.out.println("My favourite fruits " +
                "are \"Kiwi\" and \"Orange\"");                 //  My favourite fruits are "Kiwi" and "Oranges"

    }

}
