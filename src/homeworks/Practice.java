package homeworks;

public class Practice {
    public static void main(String[] args) {
        //String str = "AxyzBBB";
        //System.out.println(Practice.xyzMiddle(str));

        String str="12xy34xyabcxy";
        String word = "xy";

        String newStr = "";
        if (str.contains(word)) {
            for (int i = 0; i < str.length() - word.length() + 1; i++) {
                if (str.substring(i, i + word.length()).equals(word)) {

                    newStr += word;
                    i += word.length();
                } else
                    newStr += "+";
            }
        }

        System.out.println(newStr);


    }


    public static boolean xyzMiddle(String str) {
        String newStr = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

        if (str.length() < 3) return false;
        else if (str.length() == 3) return true;
        else {
            if (str.length() % 2 != 0 && newStr.equals("xyz"))
                return true;
            else {
                return (newStr.equals("xyz")) ;
            }
        }

    }


    public static String plusOut(String str, String word) {
        String newStr = "";
        if (str.contains(word)) {
            for (int i = 0; i < str.length() - word.length() + 1; i++) {
                if (str.substring(i, i + word.length()).equals(word)) {

                    newStr += word;
                    i += word.length();
                } else
                    newStr += "+";
            }
        }
        return newStr;
    }
}
