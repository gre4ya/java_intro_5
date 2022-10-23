package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("------Task-1------");

        String name = ScannerHelper.getAName();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + name.substring((name.length()-3)));
        System.out.println(name.charAt(0)=='A'||name.charAt(0)=='a'?
                            "You are in the club!" : "Sorry, you are not in the club" );

        System.out.println("------Task-2------");

        String city = ScannerHelper.getAnAddress();
        if(city.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if(city.toLowerCase().contains("des plaines"))
            System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");

        System.out.println("------Task-3------");

        String favColors = ScannerHelper.get4FavColors();
        if(favColors.toLowerCase().contains("green") && favColors.toLowerCase().contains("red"))
            System.out.println("Green and red are in the list");
        else if(favColors.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else if(favColors.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");


        System.out.println("------Task-4------");

        String str = "    Java is Fun   ";
        str = str.trim().toLowerCase();
        String str1 = str.substring(0, str.indexOf(" "));
        String str2 = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" "));
        String str3 = str.substring(str.lastIndexOf(" ") + 1);


        System.out.println("The first word in the str is = " + str1);
        System.out.println("The second word in the str is = " + str2);
        System.out.println("The third word in the str is = " + str3);

    }
}
