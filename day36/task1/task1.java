package day36.task1;

import java.time.LocalDate;
import java.time.Period;

public class task1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusYears(1).minusMonths(1).minusDays(1);
        Period between = Period.between(yesterday,today);
        System.out.println(between);
    }
}
