package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static <ArraysList> void main(String[] args) {
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
            }
            else newStr += "+";
          }
        }

        System.out.println(newStr);

        String str1 = "Hello World";
        ArrayList<String> STR1 = new ArrayList<>(Arrays.asList(str1.split(" ")));
        System.out.println(STR1);

        int[] outer = {1, 2, 4, 6};
        int[] inner = {2, 3, 4};
        System.out.println(linearIn(outer, inner));
    }


    public static boolean xyzMiddle(String str) {
        String newStr = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

        if (str.length() < 3) return false;
        else if (str.length() == 3) return true;
        else {
          if (str.length() % 2 != 0 && newStr.equals("xyz")) return true;
          else return (newStr.equals("xyz")) ;
        }
    }

    public static String plusOut(String str, String word) {
        String newStr = "";
        if (str.contains(word)) {
          for (int i = 0; i < str.length() - word.length() + 1; i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
              newStr += word;
              i += word.length();
              }
            else newStr += "+";
          }
        }
        return newStr;
    }
    public static boolean linearIn(int[] outer, int[] inner) {
        if(inner.length == 0) return true;
        boolean result = false;
        String outerStr = Arrays.toString(outer);
        outerStr = outerStr.replaceAll(",","").replaceAll(" ", "").replaceAll("\\[", "").replaceAll("\\]","");
        for(int i = 0; i < inner.length; i++){
            if(outerStr.contains(String.valueOf(inner[i]))) result = true;
            else {
                result = false;
                break;
            }
        }
        return result;
}
}
