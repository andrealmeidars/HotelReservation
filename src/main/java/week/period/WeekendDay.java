package week.period;


public class WeekendDay {
     public boolean isWeekend(String day){

          if (day.equals("sat") || day.equals("sun")){
              return  true;
          }
          return false;

    }


}
