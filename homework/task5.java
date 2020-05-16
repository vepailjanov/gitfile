package homework;


    import java.time.LocalDateTime;
    import java.time.Period;
    import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class task5 {

        public static int checkAge(String dateOfBirth){
            LocalDate dob = LocalDate.of(1988,8,14);
            LocalDate today = LocalDate.now();
            Period between = Period.between(dob,today);
            return between.getYears();
        }


    }

