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
        String[] colors2 = {"redvelvet ", "i", "red", "blue", "yellow", "white"};
        findingLongestAndShortest(colors);
        findingLongestAndShortest(colors2);
    }


    public static void findingLongestAndShortest(String[] str){
        String longest = "";
        String shortest = "";
        boolean isLongest = false, isShortest = false;

        for (int i = 0; i < str.length - 1; i++) {
            if(!isShortest && str[i].length() < str[i + 1].length()) {
                shortest = str[i];
                isShortest = true;
            }
            else if(!isLongest && str[i].length() > str[i + 1].length()) {
                longest = str[i];
                isLongest = true;
            }
        }
        System.out.println("Shortest = " + shortest);
        System.out.println("Longest = " + longest);
    }
}
