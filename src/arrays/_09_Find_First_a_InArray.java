package arrays;

public class _09_Find_First_a_InArray {
    public static void main(String[] args) {

        String[] words = {"ABCD", "abcd", "123", "!@#"};
//        String[] words = {"abcd", "123", "!@#"};
//        String[] words = {{"123", "!@#"};

        firstAInString(words);


/*
        Example1:
        - array =  {"ABCD", "abcd", "123", "!@#"}

        Output1:
        First string with "a" = "ABCD"

        Example2:
        - array =  {"abcd", "123", "!@#"}

        Output2:
        First string with "a" = "abcd"

        Example3:
        - array =  {"123", "!@#"}

        Output3:
        No String starting with "a"
                */
    }


    /*
    Create a public static method which will take a String array then it will
    print out the first String starting with "a", NOT CASE SENSITIVE
    If there is not a String which is starting with "a" print -> 'No String starting with "a"'
     */
   public static void firstAInString(String[] words){
       String firstA = "";
       for (String word : words){
           if(word.toLowerCase().startsWith("a")){
               firstA = word;
               break;
           }
       }
       System.out.println(!firstA.isEmpty() ? "First string with \"a\" = " + "\"" + firstA + "\"" :
               "No string string with \"a\"");
   }
}
