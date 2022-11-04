package arrays;

public class _11_Find_Longest_Shortest {
    public static void main(String[] args) {
    /*
    create a public static method which will take a String array then it will print the longest and shortest
    string from that array.
    Example:
    Array ->  String[] colors = {"red", "blue", "yellow", "white"};
    Output:
        Shortest = red
        Longest = yellow
     */

        String[] colors = {"red", "blue", "yellow", "white"};
        String[] colors2 = {"i", "red velvet", "red", "blue", "yellow", "white"};
        findingLongestAndShortest(colors);
        findingLongestAndShortest(colors2);
    }
    public static void findingLongestAndShortest(String[] str){
        String longest = str[0];
        String shortest = str[0];

        for (String s : str) {
            if (s.length() < shortest.length())
                shortest = s;

            if (s.length() > longest.length())
                longest = s;
        }
        System.out.println("Shortest = " + shortest);
        System.out.println("Longest = " + longest);
    }
}
