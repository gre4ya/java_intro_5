package operators.logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean b1 = 3 < 5; //true
        boolean b2 = 5 != 5; //false
        boolean b3 = 2 == 2; //true
        boolean b4 = b1 || b2 || b3; //true
        boolean b5 = b1 && b2 && b3; //false

        System.out.println(b1); //true
        System.out.println(!b1); //false
        System.out.println(!b2 && b1 || b3); //true
        System.out.println((false || false && true || false)); //false
        System.out.println(!(false || false && true || false)); //true
        System.out.println(!(10 > 3 * 3) == (4 / 2 + 10) > 10 != (4 * 4 -4) < 20); //
        System.out.println((11*2+2)/4 == 6 != 49/7 > 6 == (3+8)*3/11 < 2*2); //
        System.out.println(2>1 && 3==3 && 1!=2 && 3>3); //
        System.out.println(5==5 || (10>=10 && 9<11 && 3!=3) || 5<=4); //


    }
}
