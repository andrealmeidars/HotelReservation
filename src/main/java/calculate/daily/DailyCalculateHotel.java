package calculate.daily;


public class DailyCalculateHotel {

    public String dailyCalculate(String clientType, String day1, String day2, String day3){
        if (  (clientType.equals("Regular"))  && (day1.equals("mon"))  && (day2.equals("tues")) &&  (day3.equals("wed")) )   {
            return "Lakewood";
        }
        return "Lake";

    }
}
