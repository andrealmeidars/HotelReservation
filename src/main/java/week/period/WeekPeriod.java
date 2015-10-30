package week.period;


public class WeekPeriod {
     public String returnWeekOrWeekend(String day){

          if (day.equals("sat") || day.equals("sun")){
              return  "weekend";
          }
          return "week";

    }


}
