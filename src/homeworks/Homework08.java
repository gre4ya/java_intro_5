package homeworks;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {

    public static void main(String[] args) {

        System.out.println("--------------TASK-1--------------");

        String str = "hello";
        String str2 = " ";
        String str3 = "JAVA";
        System.out.println(countConsonants(str));
        System.out.println(countConsonants(str2));
        System.out.println(countConsonants(str3));

        System.out.println("--------------TASK-2--------------");

        str = "hello";
        str2 = "java is  fun";
        str3 = "Hello, nice to meet you!!";
        System.out.println(Arrays.toString(wordArray(str)));
        System.out.println(Arrays.toString(wordArray(str2)));
        System.out.println(Arrays.toString(wordArray(str3)));

        System.out.println("--------------TASK-3--------------");

        str = "hello";
        str2 = "java  is    fun";
        str3 = "   Hello,    nice to   meet     you!!  ";
        System.out.println(removeExtraSpaces(str));
        System.out.println(removeExtraSpaces(str2));
        System.out.println(removeExtraSpaces(str3));

        System.out.println("--------------TASK-4--------------");

//        str = "I go to TechGlobal";
//        str2 = "Hi, my name is John Doe";
//        str3 = "Hello guys";
        System.out.println(count3OrLess());
        System.out.println(count3OrLess());
        System.out.println(count3OrLess());

        System.out.println("--------------TASK-5--------------");

        String dateOfBirth = "01/21/1999";
        String dateOfBirth2 = "1/20/1991";
        String dateOfBirth3 = "0/2/1991";
        String dateOfBirth4 = "12-20 2000";
        String dateOfBirth5 = "12/16/19500";

        System.out.println(isDateFormatValid(dateOfBirth));
        System.out.println(isDateFormatValid(dateOfBirth2));
        System.out.println(isDateFormatValid(dateOfBirth3));
        System.out.println(isDateFormatValid(dateOfBirth4));
        System.out.println(isDateFormatValid(dateOfBirth5));

        System.out.println("--------------TASK-6--------------");

        String email = "abc@gmail.com";
        String email2 = "abc@student.techglobal.com";
        String email3 = "a@gmail.com";
        String email4 = "abcd@@gmail.com";
        String email5 = "abc@gmail";

        System.out.println(isEmailFormatValid(email));
        System.out.println(isEmailFormatValid(email2));
        System.out.println(isEmailFormatValid(email3));
        System.out.println(isEmailFormatValid(email4));
        System.out.println(isEmailFormatValid(email5));


    }
    ///////////////////////TASK-1/////////////////////////////
    public static int countConsonants(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).toLowerCase().matches("[a-z&&[^aeiou]]")) counter++;
        }
        return counter; // return str.trim().toLowerCase().replaceAll("[aeiou]", "").length();

    }
    ///////////////////////TASK-2/////////////////////////////
    public static String[] wordArray(String str){
        return str.split("[^a-zA-z]+");
    }
    ///////////////////////TASK-3/////////////////////////////
    public static String removeExtraSpaces(String str){
        Pattern pattern = Pattern.compile("[a-zA-z\\S]+");
        Matcher matcher = pattern.matcher(str);
        String newStr = "";
        while(matcher.find()){
            newStr += matcher.group() + " ";
        }
        return newStr.substring(0, newStr.length()-1);
    }
    ///////////////////////TASK-4/////////////////////////////
    public static int count3OrLess(){
        String str = ScannerHelper.getASentence();
        String[] arr = str.split("[a-zA-Z]{4,}");
        Pattern p = Pattern.compile("[a-zA-Z]{1,3}");
        Matcher m = p.matcher(Arrays.toString(arr));

        int count = 0;
        while (m.find()) count++;
        return count;
    }
    ///////////////////////TASK-5/////////////////////////////
    public static  boolean isDateFormatValid(String dateOfBirth){
        return Pattern.matches("\\d{2}/\\d{2}/\\d{4}", dateOfBirth);
    }
    ///////////////////////TASK-6/////////////////////////////
    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("\\w{2,}@[\\w.]{2,}\\.\\w{2,}", email);
    }
}
