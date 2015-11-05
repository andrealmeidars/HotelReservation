package calculate.daily;


import hotel.Hotel;
import hotel.HotelList;
import java.util.List;


public class HostingHotelCalculate {
    private List<Hotel> hotels;



    public String calculateHotels(boolean clientType, List<String > days){


        double lowerHostingValue = 0;
        String hotelName = "";
        double classificationHotel = 0;
        hotels = HotelList.getHotelList();


         for (Hotel hotel : hotels){

            double hostingValue = hotel.calculateHostingValue(clientType, days);

            if (  (lowerHostingValue == 0 ) ||  ( lowerHostingValue >= hostingValue) ) {
                hotelName = hotel.getHotelName();
                lowerHostingValue = hostingValue;

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
