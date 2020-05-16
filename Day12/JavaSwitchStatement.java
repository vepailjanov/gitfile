package Day12;

import java.util.Random;

public class JavaSwitchStatement {

    //switch

    public static void main(String[] args) {
        Random random = new Random();
        int day = random.nextInt( 10 ); //0 - 7
        System.out.println( "Your day is: " +  day );

        switch(day) {
            case 1: // if day == 1
                System.out.println( "It's : " +"Monday" );
                break;
            case 2:// if day == 2
                System.out.println( "It's : " +"Tuesday" );
                break;
            case 3:// if day == 3
                System.out.println("It's : " + "Wednesday" );
                break;
            case 4:
                System.out.println("It's : " +"Thursday");
                break;
            case 5:
                System.out.println("It's : " +"Friday");
                break;
            case 6:
                System.out.println("It's : " +"Saturday");
                break;
            case 7:
                System.out.println("It's : " +"Sunday");
                break;
            default:// else
                System.out.println( "It's : " +"not a valid day number" );
                break;
        }

    }

}
