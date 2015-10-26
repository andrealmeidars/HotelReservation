package hotel;

import model.*;
import week.period.WeekPeriod;

public class Hotel {
    private HotelName hotelName;
    private ClassificationHotelValue classificationHotelValue;
    private DailyRegularHotelValue dailyRegularHotelValue;
    private DailyPremiumHotelValue dailyPremiumHotelValue;
    private WeekPeriod weekPeriod;


    public Hotel(HotelName hotelName, ClassificationHotelValue classificationHotelValue,
                 DailyRegularHotelValue dailyRegularHotelValue, DailyPremiumHotelValue dailyPremiumHotelValue) {
        this.hotelName = hotelName;
        this.classificationHotelValue = classificationHotelValue;
        this.dailyRegularHotelValue = dailyRegularHotelValue;
        this.dailyPremiumHotelValue = dailyPremiumHotelValue;
        this.weekPeriod = new WeekPeriod();
    }


    public String getHotelName() {
        return hotelName.getHotelName();
    }

    public double getClassificationHotelValue() {
        return classificationHotelValue.getClassificationValue();
    }

    public double getDailyRegularHotelWeekValue() {
        return dailyRegularHotelValue.getDailyRegularClientWeekValue();
    }

    public double getDailyRegularHotelWeekendValue() {
        return dailyRegularHotelValue.getDailyRegularClientWeekendValue();
    }



    public double getDailyPremiumHotelWeekValue() {
        return dailyPremiumHotelValue.getDailyPremiumClientWeekValue();
    }

    public double getDailyPremiumHotelWeekendValue() {
        return dailyPremiumHotelValue.getDailyPremiumClientWeekendValue();
    }


    public double calculateHostingValue(String customerType, String day1, String day2, String day3){

        String[] days = {day1, day2, day3};

        double hostingValue = 0;


        for (String hostingDay : days) {

            if (customerType.equals("Regular")) {
                if (weekPeriod.returnWeekPeriod(hostingDay).equals("week")) {
                    hostingValue =  hostingValue + getDailyRegularHotelWeekValue();
                } else if (weekPeriod.returnWeekPeriod(day1).equals("weekend")) {
                    hostingValue = getDailyRegularHotelWeekendValue();
                }


            } else if (customerType.equals("Premium")) {
                if (weekPeriod.returnWeekPeriod(hostingDay).equals("week")) {
                    hostingValue = getDailyPremiumHotelWeekValue();
                }
            }
        }



         return hostingValue;
    }
}
