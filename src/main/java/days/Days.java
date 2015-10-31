package days;

import java.util.Scanner;

public class Days {


    public String returnDayHosting(){

        int count = 0;

        System.out.println(" Choose one day");

        String[] days = {"sun", "mon", "tues", "wed", "thur", "fri", "sat"  };

        for (String day : days) {

            System.out.println( "Option " + count +" = " + day);
            count = count + 1;
        }

        Scanner day = new Scanner(System.in);
        int dayHosting = day.nextInt();
        return days[dayHosting];

    }
}
