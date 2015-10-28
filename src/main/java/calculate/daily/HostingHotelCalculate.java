package calculate.daily;


import hotel.Hotel;
import model.DailyRatePremiumHotelValue;
import model.DailyRateRegularHotelValue;


public class HostingHotelCalculate {

    public String calculateHotels(String clientType, String day1, String day2, String day3){

        Hotel Lakewood = new Hotel("Lakewood", 3,
                new DailyRateRegularHotelValue(110, 90), new DailyRatePremiumHotelValue(80,80));


        double LakewoodValue = Lakewood.calculateHostingValue(clientType,day1,day2,day3);







        return Lakewood.getHotelName();

    }
}
