package first_package;

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
        catch (StringIndexOutOfBoundsException e1){
            e1.printStackTrace();
        }
        System.out.println("Hello " + name);
    }
}
