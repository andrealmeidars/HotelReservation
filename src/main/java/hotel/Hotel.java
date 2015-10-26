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
}
