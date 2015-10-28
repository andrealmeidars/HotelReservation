package calculate.daily;


import hotel.Hotel;
import model.DailyRatePremiumHotelValue;
import model.DailyRateRegularHotelValue;


public class HostingHotelCalculate {

    public String calculateHotels(String clientType, String day1, String day2, String day3){

        Hotel Lakewood = new Hotel("Lakewood", 3,
                new DailyRateRegularHotelValue(110, 90), new DailyRatePremiumHotelValue(80,80));

        Hotel Bridgewood = new Hotel("Bridgewood", 4,
                new DailyRateRegularHotelValue(160, 110), new DailyRatePremiumHotelValue(60,50));



        double LakewoodValue = Lakewood.calculateHostingValue(clientType,day1,day2,day3);
        double BridgewoodValue = Bridgewood.calculateHostingValue(clientType,day1,day2,day3);

        if (LakewoodValue < BridgewoodValue){
            return Lakewood.getHotelName();
        }else
            return Bridgewood.getHotelName();


    }
}
