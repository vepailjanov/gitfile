package git;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dateFormatter {
    public static void main(String[] args) {
//     String date = "2020-05-18";
     LocalDate localDate = LocalDate.of(2020,05,18);
     String date1 = localDate.toString();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
     LocalDate localeData = LocalDate.parse(date1,formatter);
        System.out.println(localeData);
    }
}
