package practice.methods;

public class StringMethodPractices {
    public static void main(String[] args) {

//        System.out.println(StringMethodPractices.isCharExisting("John", 'o', 1 ));
//        System.out.println(StringMethodPractices.isCharExisting("John", 'o', 2 ));
//        System.out.println(StringMethodPractices.isCharExisting("Peter", 'o', 1 ));
//        System.out.println(StringMethodPractices.isCharExisting("Peter", 'r', 4 ));


        System.out.println(StringMethodPractices.isCharContained("John", 'o'));
        System.out.println(StringMethodPractices.isCharContained("John", 'o'));
        System.out.println(StringMethodPractices.isCharContained("Peter", 'o'));
        System.out.println(StringMethodPractices.isCharContained("Peter", 'r'));


    }
    public static boolean isCharExisting(String str, char c, int i){
        return String.valueOf(str.charAt(i)).equals(String.valueOf(c));
        // str.charAt(i) == c;
    }
    public static boolean isCharContained(String str, char c){
        return str.contains(String.valueOf(c));
        // str.contains(c + "");
    }




}


