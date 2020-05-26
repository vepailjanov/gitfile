package DateTimePractice;

import javax.swing.text.Style;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class task1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(1988,8,14);
        Period myage = Period.between(today,dob);
        System.out.println(myage);

        LocalDate beginHoliday = LocalDate.now().minusDays(4);
        System.out.println(beginHoliday);

        Period holidayLong = Period.between(beginHoliday,today);
        System.out.println(holidayLong);


        LocalDateTime now = LocalDateTime.now();
        now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("full version "+now);
        today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("local "+now);
        today.format(DateTimeFormatter.ofPattern("d/MM/yyyy/"));
        System.out.println("custom made " + now);
        now.format(DateTimeFormatter.ofPattern("d-MM-yyyy, HH:mm:ss a"));
        System.out.println("dateant time custom made "+now);
    }
}
