package hotel;


import tiny.types.DailyRatePremiumHotelValue;
import tiny.types.DailyRateRegularHotelValue;
import week.period.WeekPeriod;

import java.util.List;

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

        if (weekPeriod.isWeekend(day)) {
            hostingValue = getDailyRegularHotelWeekendValue();
        } else
            hostingValue = getDailyRegularHotelWeekValue();

        return hostingValue;
    }




    public double returnPremiumHostingDayValue(String day){
        double hostingValue;

        if (weekPeriod.isWeekend(day)) {
            hostingValue = getDailyPremiumHotelWeekendValue();
        } else
            hostingValue = getDailyPremiumHotelWeekValue();

        return hostingValue;
    }



    public double calculateHostingValue(Boolean customerRegular, List<String> days){


        double hostingValue = 0;

         for (String hostingDay : days) {


            if (customerRegular) {
                hostingValue += returnRegularHostingDayValue(hostingDay);

             } else {
                hostingValue += returnPremiumHostingDayValue(hostingDay);

            }
        }

        return hostingValue;
    }
}
