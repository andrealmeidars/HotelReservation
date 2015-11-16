package calculate.daily;


import client.type.ClientType;
import hotel.Hotel;
import hotel.HotelList;

import java.util.List;


public class HostingHotelCalculate {
    private List<Hotel> hotels;

    public String findCheapestHotelToClient(ClientType clientType, List<String> days) {
        double lowerHostingValue = 0;
        String hotelName = "";
        int classificationHotel = 0;
        hotels = new HotelList().getAll();
        for (Hotel hotel : hotels) {

            double hostingValue = hotel.calculateHostingValue(clientType, days);

            if ((lowerHostingValue == 0) || (lowerHostingValue >= hostingValue)) {
                hotelName = hotel.getName();
                lowerHostingValue = hostingValue;

                if (classificationHotel == 0) {
                    classificationHotel = hotel.getRates();
                } else if (classificationHotel > hotel.getRates()) {
                    hotelName = hotel.getName();
                }
            }

        }

        return hotelName;

    }
}
