package week.period;


public class WeekPeriod {

   private String[] week = {"mon","tues", "wed","thru", "fri"};

      public String returnWeekPeriod(String day){

        for (String value : week) {
            if (value.equals(day)) {
                return "week";
            }

        }

    return "weekend";

    }


}
