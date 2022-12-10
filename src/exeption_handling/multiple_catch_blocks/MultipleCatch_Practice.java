package exeption_handling.multiple_catch_blocks;

public class MultipleCatch_Practice {
    public static void main(String[] args) {

        String name = null;
        int age = 25;

        try{
            System.out.println(name.charAt(0));
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        try{
            System.out.println(age/0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println(name +"'s age is " + age);
    }
}
