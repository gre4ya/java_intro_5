package homeworks;

public class Practice {
    public static void main(String[] args) {
        String str = "AxyzBBB";
        System.out.println(Practice.xyzMiddle(str));
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
}