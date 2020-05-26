package git;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeFormatter {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(9,25,35);
        String time = localTime.toString();
        System.out.println(time);
        LocalTime localTime1 = LocalTime.parse(time);
        System.out.println(localTime1);

        LocalDate localDate = LocalDate.now();
        String today = localDate.toString();
        System.out.println(today);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(today,dateTimeFormatter);
        System.out.println(localDate1);
    }
}
