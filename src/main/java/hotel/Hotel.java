package hotel;

import model.*;
import week.period.WeekPeriod;

public class Hotel {
    private HotelName hotelName;
    private ClassificationHotelValue classificationHotelValue;
    private DailyRateRegularHotelValue dailyRateRegularHotelValue;
    private DailyRatePremiumHotelValue dailyRatePremiumHotelValue;
    private WeekPeriod weekPeriod;


    public Hotel(HotelName hotelName, ClassificationHotelValue classificationHotelValue,
                 DailyRateRegularHotelValue dailyRateRegularHotelValue, DailyRatePremiumHotelValue dailyRatePremiumHotelValue) {
        this.hotelName = hotelName;
        this.classificationHotelValue = classificationHotelValue;
        this.dailyRateRegularHotelValue = dailyRateRegularHotelValue;
        this.dailyRatePremiumHotelValue = dailyRatePremiumHotelValue;
        this.weekPeriod = new WeekPeriod();
    }


    public String getHotelName() {
        return hotelName.getHotelName();
    }

    public double getClassificationHotelValue() {
        return classificationHotelValue.getClassificationValue();
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


    public double calculateHostingValue(String customerType, String day1, String day2, String day3){

        String[] days = {day1, day2, day3};

        double hostingValue = 0;


        for (String hostingDay : days) {

            if (customerType.equals("Regular")) {
                if (weekPeriod.returnWeekPeriod(hostingDay).equals("week")) {
                    hostingValue =  hostingValue + getDailyRegularHotelWeekValue();
                } else if (weekPeriod.returnWeekPeriod(hostingDay).equals("weekend")) {
                    hostingValue =  hostingValue + getDailyRegularHotelWeekendValue();
                }


            } else if (customerType.equals("Premium")) {
                if (weekPeriod.returnWeekPeriod(hostingDay).equals("week")) {
                    hostingValue =  hostingValue + getDailyPremiumHotelWeekValue();
                }else if (weekPeriod.returnWeekPeriod(hostingDay).equals("weekend")) {
                    hostingValue =  hostingValue + getDailyPremiumHotelWeekendValue();
                }

            }
        }



         return hostingValue;
    }
}
