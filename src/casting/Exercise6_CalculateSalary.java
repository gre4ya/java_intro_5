package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {

        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        double minSalary = Math.min(Math.min(Double.parseDouble(salary1),
                Double.parseDouble(salary2)), Double.parseDouble(salary3));

        double maxSalary = Math.max(Math.max(Double.parseDouble(salary1),
                Double.parseDouble(salary2)), Double.parseDouble(salary3));

        System.out.println("Min salary = $" + minSalary +"\nMax salary = $" + maxSalary);

        System.out.println(minSalary * .1);



    }
}
