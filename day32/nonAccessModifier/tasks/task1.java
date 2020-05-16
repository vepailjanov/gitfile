package day32.nonAccessModifier.tasks;

import java.util.Arrays;

public class task1 {
  static final  String [] months = {"January", "February", "March", "April", "May", "June",
          "July", "August", "September", "October", "November","December"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(months));
        task1.months[1]="January";
        System.out.println(Arrays.toString(task1.months));
    }
}
