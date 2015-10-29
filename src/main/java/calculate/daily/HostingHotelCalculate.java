package calculate.daily;


import hotel.Hotel;
import hotel.HotelList;
import model.DailyRatePremiumHotelValue;
import model.DailyRateRegularHotelValue;

import java.util.List;


public class HostingHotelCalculate {
    private List<Hotel> hotels;



    public String calculateHotels(String clientType, String day1, String day2, String day3){


        double hostingValue = 0;
        String hotelName = "";
        double classificationHotel = 0;
        hotels = HotelList.getHotelList();



        for (Hotel hotel : hotels){

            if (  (hostingValue == 0 ) ||  ( hostingValue >= hotel.calculateHostingValue(clientType, day1, day2, day3)) ) {
                hotelName = hotel.getHotelName();
                hostingValue = hotel.calculateHostingValue(clientType, day1, day2, day3);

                if (classificationHotel == 0){
                    classificationHotel = hotel.getClassificationHotelValue();
                } else if (classificationHotel > hotel.getClassificationHotelValue()) {
                    hotelName = hotel.getHotelName();
                }
            }

        }


        return hotelName;


    }
}
