package arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {


        String sentence = "I love arrays";
        int spaceCounter = 0;
         char[] s = sentence.toCharArray();
        for (char element : s){
            if(element == ' ') spaceCounter++;
        }
        System.out.println(spaceCounter + 1);

        System.out.println("---------Solution with 2 splits------------");

        String[] arr = sentence.split(" "); // [I, love, arrays]
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

    }
}
