package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DurationAndPeriod {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1993, 9, 14);

        System.out.println(today); // 2022-12-11
        System.out.println(dateOfBirth); // 1993-09-14

        System.out.println(Period.between(dateOfBirth, today).getYears()); // 29
        System.out.println(Period.between(dateOfBirth, today).getMonths()); // 2
        System.out.println(Period.between(dateOfBirth, today).getDays()); // 27

        // Using ChronoUnit

        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today));  // 29
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today)); // 350
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today)); // 1525
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today)); // 10680
        

        LocalTime localTime1 = LocalTime.of(12,44,15);
        LocalTime localTime2 = LocalTime.of(13,45,45);

        System.out.println(Duration.between(localTime1, localTime2).getSeconds()); // 3690

        // Using ChronoUnit
        
        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2)); // 1
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2)); // 61
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2)); // 3690
    }
}
