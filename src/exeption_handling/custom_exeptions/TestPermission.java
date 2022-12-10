package exeption_handling.custom_exeptions;

import utilities.ScannerHelper;

public class TestPermission {
    public static void main(String[] args) {

        int age = ScannerHelper.getAnAge();
        try{
            if (Permission.isAgeValid(age)) System.out.println("You can get DL");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("you are " + age + ".");
        }
    }


}
