package hotel;


import tiny.types.DailyRatePremiumHotelValue;
import tiny.types.DailyRateRegularHotelValue;

import java.util.ArrayList;
import java.util.List;

public class HotelList {
    public static List<Hotel> getHotelList(){
        List<Hotel> hotels = new ArrayList<>();

        Hotel Lakewood = new Hotel("Lakewood", 3,
                new DailyRateRegularHotelValue(110, 90), new DailyRatePremiumHotelValue(80,80));

        Hotel Bridgewood = new Hotel("Bridgewood", 4,
                new DailyRateRegularHotelValue(160, 60), new DailyRatePremiumHotelValue(110,50));

        Hotel Ridgewood = new Hotel("Ridgewood", 5,
                new DailyRateRegularHotelValue(220, 150), new DailyRatePremiumHotelValue(100,40));


        hotels.add(Lakewood);
        hotels.add(Bridgewood);
        hotels.add(Ridgewood);

        return hotels;
    }



}
