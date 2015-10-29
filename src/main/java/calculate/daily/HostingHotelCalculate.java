package calculate.daily;


import hotel.Hotel;
import model.DailyRatePremiumHotelValue;
import model.DailyRateRegularHotelValue;




public class HostingHotelCalculate {

    public String calculateHotels(String clientType, String day1, String day2, String day3){

        double hostingValue = 0;
        String hotelName = "";
        double classificationHotel = 0;


        Hotel Lakewood = new Hotel("Lakewood", 3,
                new DailyRateRegularHotelValue(110, 90), new DailyRatePremiumHotelValue(80,80));

        Hotel Bridgewood = new Hotel("Bridgewood", 4,
                new DailyRateRegularHotelValue(160, 60), new DailyRatePremiumHotelValue(110,50));

        Hotel Ridgewood = new Hotel("Ridgewood", 5,
                new DailyRateRegularHotelValue(220, 150), new DailyRatePremiumHotelValue(100,40));


        Hotel[] hotels = {Lakewood, Bridgewood, Ridgewood};

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
