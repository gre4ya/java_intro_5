package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("-------- Task 1 --------");

        String s1 = "24", s2 = "5";
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        double e1 = Double.parseDouble(s1);
        double e2 = Double.parseDouble(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (n1 + n2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (n1 - n2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " + e1 / e2);
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + n1 * n2);
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + n1 % n2);

        System.out.println("-------- Task 2 --------");

        int myRandom = (int)(Math.random() * 35 + 1);
        System.out.println(myRandom == 2 || myRandom == 3 || myRandom != 1 && myRandom % 2 != 0 && myRandom % 3 != 0?
                           myRandom + " IS A PRIME NUMBER" : myRandom + " IS NOT A PRIME NUMBER");

        System.out.println("-------- Task 3 --------");

        int myRandom1 = (int)(Math.random() * 50 + 1);
        int myRandom2 = (int)(Math.random() * 50 + 1);
        int myRandom3 = (int)(Math.random() * 50 + 1);

        int max = Math.max(Math.max(myRandom1, myRandom2), myRandom3);
        int min = Math.min(Math.min(myRandom1, myRandom2), myRandom3);

        System.out.println("Lowest Number is = " + min);
        if(myRandom1 != min & myRandom1 != max) System.out.println("Middle Number is = " + myRandom1);
        else if(myRandom2 != min & myRandom2 != max) System.out.println("Middle Number is = " + myRandom2);
        else System.out.println("Middle Number is = " + myRandom3);
        System.out.println("Greatest Number is = " + max);

        System.out.println("-------- Task 4 --------");

        char a = 'R';
        int a1 = (int)a;
        if(a1>=65 & a1<=90) System.out.println("The letter is uppercase");
        else if (a1 >=97 & a1<= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        System.out.println("-------- Task 5 --------");

        char b = '#';
        int b1 = (int)b;
        if(b1>=65 & b1<=90 || b1 >=97 & b1<= 122) {
            if(b1==65||b1==69||b1==73||b1==79||b1==85||b1==97||b1==101||b1==105||b1==111||b1==117)
                System.out.println("The letter is vowel");
            else System.out.println("The letter is consonant");
        }
        else System.out.println("Invalid character detected!!!");

        System.out.println("-------- Task 6 --------");

        char c = '*';
        int c1 = (int)a;
        if(c1 > 31 & c1 < 48 || c1 > 57 & c1 < 65 || c1 > 90 & c1 < 97 || c1 > 122 & c1 < 127)
            System.out.println("Special character is = " + c);
        else System.out.println("Invalid character detected!!!");

        System.out.println("-------- Task 7 --------");

        char d = '~';
        int d1 = (int)d;

        if(d1 > 64 & d1 < 91 || d1 > 96 & d1 < 123) System.out.println("Character is a letter");
        else if(d1 > 47 & d1 < 58) System.out.println("Character is a digit");
        else if(d1 > 31 & d1 < 48 || d1 > 57 & d1 < 65 || d1 > 90 & d1 < 97 || d1 > 122 & d1 < 127)
            System.out.println("Character is a special character");

    }
}
