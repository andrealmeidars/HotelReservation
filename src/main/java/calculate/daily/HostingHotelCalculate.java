package calculate.daily;





public class HostingHotelCalculate {

    public String dailyCalculate(String clientType, String day1, String day2, String day3){



        if (  (clientType.equals("Regular"))  && (day1.equals("mon"))  && (day2.equals("tues")) &&  (day3.equals("wed")) )   {
            return "Lakewood";
        }else if (  (clientType.equals("Regular"))  && (day1.equals("fri"))  && (day2.equals("sat")) &&  (day3.equals("sun")) ){
            return "Bridgewood";

        }
        return "Lake";

    }
}
