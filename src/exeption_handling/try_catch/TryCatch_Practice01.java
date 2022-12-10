package exeption_handling.try_catch;

import utilities.ScannerHelper;

public class TryCatch_Practice01 {
    public static void main(String[] args) {

          /*
          Get a name from the user
          And print 4th char of the name
          Then, say Hello {name}
           */

        String name = ScannerHelper.getAName();
        try {
            System.out.println(name.charAt(3));
        }
        catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
            //add to logger
        }
        System.out.println("Hello " + name);
    }
}
