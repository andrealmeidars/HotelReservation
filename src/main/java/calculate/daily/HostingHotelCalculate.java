package calculate.daily;


import hotel.Hotel;
import model.DailyRatePremiumHotelValue;
import model.DailyRateRegularHotelValue;




public class HostingHotelCalculate {

    public String calculateHotels(String clientType, String day1, String day2, String day3){

        double hostingValue = 0;
        String hotelName = "";


        Hotel Lakewood = new Hotel("Lakewood", 3,
                new DailyRateRegularHotelValue(110, 90), new DailyRatePremiumHotelValue(80,80));

        Hotel Bridgewood = new Hotel("Bridgewood", 4,
                new DailyRateRegularHotelValue(160, 110), new DailyRatePremiumHotelValue(60,50));


        Hotel[] hotels = {Lakewood, Bridgewood};

        for (Hotel hotel : hotels){

            if (  (hostingValue == 0 ) ||  ( hostingValue > hotel.calculateHostingValue(clientType, day1, day2, day3)) ) {
                hotelName = hotel.getHotelName();
                hostingValue = hotel.calculateHostingValue(clientType, day1, day2, day3);
                System.out.print("valor :  " + hostingValue);

            }
        }


        return hotelName;


    }
}
