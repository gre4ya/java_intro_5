package string_methods;

public class _07_indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {
        /*
        1. return
        2. returns int - matching index
        3. non-static
        4. it takes a chat or String - there are overloaded methods
         */

        String company = "TechGlobal School";

        int firstIndexOfO = company.indexOf('o'); // 6
        System.out.println(firstIndexOfO);
        int lastIndexOfO = company.lastIndexOf('o');
        System.out.println(lastIndexOfO); //15

        System.out.println(company.indexOf('l')); // 5
        System.out.println(company.lastIndexOf('l')); // 16

        System.out.println(company.indexOf('X')); // -1

        System.out.println(company.indexOf("School")); // 11
    }
}
