package Day7;

import java.text.NumberFormat;

public class task7 {
    public static void main(String[] args) {
        // getCurrencyInstance or GetPercentageInstance methods
        NumberFormat percenage = NumberFormat.getPercentInstance();
        String result1 = percenage.format(12345687.890);
        System.out.println(result1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result2 = currency.format(12345687.890);
        System.out.println(result2);
        // MATH METHODS
        // Math.round method
        int result = Math.round(123.34f);
        System.out.println(result);
        // Math.ceil method
        int result4 = (int)Math.ceil(123.34f);
        System.out.println(result4);
        // Math.floor method
        int result5 = (int)Math.floor(123.34f);
        System.out.println(result5);
        // Math.max method
        int result6 = Math.max(12, 34);
        System.out.println(result6);
        // Math.min method
        int result7 = Math.min(32, 35);
        System.out.println(result7);
        // Math.random method
        int result8 = (int)Math.round(Math.random() * 100);
        System.out.println(result8);


    }

}
