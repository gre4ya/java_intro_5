package practice.variablesPractices;

public class ArticlePractice {
    public static void main(String[] args){
        String myName = "Andrii";
        String myLastName = "Grechyn";
        String myFullName = myName + " " + myLastName;
        String myHobby1 = "Reading";
        String myHobby2 = "Gym";
        int birthYear = 1993;
        double monthlyIncome = 2345.5;
        char dollarsign = '$';
        boolean isReach = false;

        System.out.println("My full name is " + myFullName + ". I was born in " +
                "\"" + birthYear + "\". " + "My hobbies are " + myHobby1 + "/" + myHobby2 + "." +
                "\nMy monthly income is " + monthlyIncome + dollarsign + ". Am I rich ? = \"" + isReach +"\"." );

    }
}
