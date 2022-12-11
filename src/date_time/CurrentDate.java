package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {

        System.out.println("----------------Date class----------------");

        Date date = new Date();
        System.out.println(date); // Sun Dec 11 11:13:17 CST 2022

        System.out.println("----------------LocalDate class----------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2022-12-11 (yyyy-MM-dd)

        System.out.println(localDate.plusDays(7)); // 2022-12-11 + 7 days = 2022-12-18
        System.out.println(localDate.getMonth()); // DECEMBER
        System.out.println(localDate.getMonthValue()); // 12
        System.out.println(localDate.getDayOfWeek()); // SUNDAY
        System.out.println(localDate.getDayOfMonth()); // 11
        System.out.println(localDate.getDayOfYear()); // 345

        System.out.println("----------------LocalTime class----------------");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 11:18:59.467 (hh:mm:ss.SSS)
        System.out.println(localTime.minus(2, ChronoUnit.HOURS)); // 11:30:37.822 - 2 hours = 09:30:37.822

        System.out.println("----------------LocalDateTime class----------------");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2022-12-11T11:21:59.924 (yyyy-MM-dd)T(hh:mm:ss.SSS)
    }
}
