package homeworks;

public class Practice02 {
    public static void main(String[] args) {
        String str = "zzzopzop";
        String newStr = "";
        int i = 0;

        while(i < str.length() - 2){
            if(str.charAt(i) == 'z' && str.charAt(i + 2) == 'p'){

                newStr += str.substring(0, i + 1);
                str = str.substring(i + 2);
                i = 0;
            }
            i++;
        }
        newStr += str;
        System.out.println(newStr);
    }
}
