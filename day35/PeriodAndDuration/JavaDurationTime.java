package day35.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class JavaDurationTime {
    public static void main(String[] args) {
        LocalTime morning = LocalTime.of(9,00);
        LocalTime evening = LocalTime.of(17,30);
        Duration between = Duration.between(morning,evening);
        Duration duration = Duration.ofDays(32);
        System.out.println(duration);
        System.out.println(between);

        LocalTime start = LocalTime.of(10,00);
        LocalTime end = LocalTime.of(13,00);
        Duration courseDuration = Duration.between(start,end);
        System.out.println(courseDuration);

    }
}
