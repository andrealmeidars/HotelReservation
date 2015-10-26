package hotel;

import model.*;

public class Hotel {
    private HotelName hotelName;
    private ClassificationHotelValue classificationHotelValue;
    private DailyRegularHotelValue dailyRegularHotelValue;
    private DailyPremiumHotelValue dailyPremiumHotelValue;


    public Hotel(HotelName hotelName, ClassificationHotelValue classificationHotelValue,
                 DailyRegularHotelValue dailyRegularHotelValue, DailyPremiumHotelValue dailyPremiumHotelValue) {
        this.hotelName = hotelName;
        this.classificationHotelValue = classificationHotelValue;
        this.dailyRegularHotelValue = dailyRegularHotelValue;
        this.dailyPremiumHotelValue = dailyPremiumHotelValue;
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


    public String calculateHostingValue(String customerType, String day1, String day2, String day3){

         return getHotelName();
    }
}
