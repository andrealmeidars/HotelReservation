package hotel;

import model.*;
import week.period.WeekPeriod;

public class Hotel {
    private String hotelName;
    private double classificationHotelValue ;
    private DailyRateRegularHotelValue dailyRateRegularHotelValue;
    private DailyRatePremiumHotelValue dailyRatePremiumHotelValue;
    private WeekPeriod weekPeriod;


    public Hotel(String hotelName, double classificationHotelValue,
                 DailyRateRegularHotelValue dailyRateRegularHotelValue, DailyRatePremiumHotelValue dailyRatePremiumHotelValue) {
        this.hotelName = hotelName;
        this.classificationHotelValue = classificationHotelValue;
        this.dailyRateRegularHotelValue = dailyRateRegularHotelValue;
        this.dailyRatePremiumHotelValue = dailyRatePremiumHotelValue;
        this.weekPeriod = new WeekPeriod();
    }


    public String getHotelName() {
        return hotelName;
    }

    public double getClassificationHotelValue() {
        return classificationHotelValue;
    }

    public double getDailyRegularHotelWeekValue() {
        return dailyRateRegularHotelValue.getDailyRateRegularClientWeekValue();
    }

    public double getDailyRegularHotelWeekendValue() {
        return dailyRateRegularHotelValue.getDailyRateRegularClientWeekendValue();
    }



    public double getDailyPremiumHotelWeekValue() {
        return dailyRatePremiumHotelValue.getDailyRatePremiumClientWeekValue();
    }

    public double getDailyPremiumHotelWeekendValue() {
        return dailyRatePremiumHotelValue.getDailyRatePremiumClientWeekendValue();
    }


    public double returnRegularHostingDayValue(String day){
        double hostingValue;

        if (weekPeriod.returnWeekPeriod(day).equals("week")) {
            hostingValue = getDailyRegularHotelWeekValue();
        } else
            hostingValue = getDailyRegularHotelWeekendValue();

        return hostingValue;
    }




    public double returnPremiumHostingDayValue(String day){
        double hostingValue;

        if (weekPeriod.returnWeekPeriod(day).equals("week")) {
            hostingValue = getDailyPremiumHotelWeekValue();
        } else
            hostingValue = getDailyPremiumHotelWeekendValue();

        return hostingValue;
    }



    public double calculateHostingValue(String customerType, String day1, String day2, String day3){

        String[] days = {day1, day2, day3};
        double hostingValue = 0;

         for (String hostingDay : days) {

            if (customerType.equals("Regular")) {
                hostingValue += returnRegularHostingDayValue(hostingDay);

             } else if (customerType.equals("Premium")) {
                hostingValue += returnPremiumHostingDayValue(hostingDay);

            }
        }

        return hostingValue;
    }
}
