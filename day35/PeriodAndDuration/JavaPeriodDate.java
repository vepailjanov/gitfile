package day35.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class JavaPeriodDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate begin = LocalDate.of(2020,3,15);
        LocalDate end = LocalDate.of(2020,9,15);
        Period btwnBgnAndToday = Period.between(begin,today);
        Period btwnBgnAndEnd = Period.between(begin,end);
        System.out.println(btwnBgnAndToday);
        System.out.println(btwnBgnAndEnd);
    }
}
