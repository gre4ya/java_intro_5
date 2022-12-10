package exeption_handling.try_catch;

import utilities.ScannerHelper;

import java.util.InputMismatchException;

public class TryCatch_Practice02 {
    public static void main(String[] args) {

        try {
            int num1 = ScannerHelper.getANumber();
            int num2 = ScannerHelper.getANumber();
            System.out.println(num1 / num2);
        }
        catch (InputMismatchException | ArithmeticException e){
            e.printStackTrace();
        }
//    combine catch:
//        catch (InputMismatchException e){
//            e.printStackTrace();
//        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//        }

        System.out.println("End of the program");

    }
}
