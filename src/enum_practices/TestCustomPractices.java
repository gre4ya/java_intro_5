package enum_practices;

import java.time.Month;
import java.time.Year;

public class TestCustomPractices {
    public static void main(String[] args) {

        Days[] days = Days.values();
        for (Days day : days) {
            System.out.println(day);
        }
        System.out.println();

        for (Month month : Month.values())
            System.out.println(month);

    }
}
