package days;

import java.util.Scanner;

public class Days {
    private int count = 0;

    public String returnDayHosting(){

        System.out.println(" Choose one day");

        String[] days = {"sun" };

        for (String day : days) {

            System.out.println( "Option " + count +" = " + day);
            count = count + 1;
        }

        Scanner day = new Scanner(System.in);
        int dayHosting = day.nextInt();
        return days[dayHosting];

    }
}
