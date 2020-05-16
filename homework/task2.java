package homework;

import sun.font.CStrike;

import java.util.Arrays;

public class task2 {
   /* Create a 2D String Array which is
    [{"new jersey","atlanta","ohio"} ,
    {"Pittsburgh" ,"ohio","new york","ohio"} ,
    {"ohio","new york"}]
    Change all the ohio to Florida
    print the array
    */
   public static void main(String[] args) {
       String [][] array =  {{"new jersey","atlanta","ohio"} ,
               {"Pittsburgh" ,"ohio","new york","ohio"} ,
               {"ohio","new york"}
       };
       array[0][2]= "Florida";
       array[1][1]= "Florida";
       array[1][3]= "Florida";
       array[2][0]= "Florida";
       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               System.out.println(array[i][j]);
           }

       }
   }
}
