package hotel;


import client.type.ClientType;
import tiny.types.Fares;
import week.period.WeekendDay;

import java.util.List;

public class Hotel {
    private final String name;
    private int rates;
    private Fares regularClientFares;
    private Fares rewardsClientFares;
    private WeekendDay weekendDay;


    public Hotel(String name, int rates, Fares regularClientFares, Fares rewardsClientFares) {
        this.name = name;
        this.rates = rates;
        this.regularClientFares = regularClientFares;
        this.rewardsClientFares = rewardsClientFares;
        this.weekendDay = new WeekendDay();
    }


    public String getName() {
        return name;
    }

    public int getRates() {
        return rates;
    }

    public double getDailyRegularHotelWeekValue() {
        return regularClientFares.getWeekdayFare();
    }

    public double getDailyRegularHotelWeekendValue() {
        return regularClientFares.getWeekendFare();
    }


    public double getDailyRewardsHotelWeekValue() {
        return rewardsClientFares.getWeekdayFare();
    }

    public double getDailyRewardsHotelWeekendValue() {
        return rewardsClientFares.getWeekendFare();
    }


    public double returnRegularHostingDayValue(String day) {
        double hostingValue;

        if (weekendDay.isWeekend(day)) {
            hostingValue = getDailyRegularHotelWeekendValue();
        } else
            hostingValue = getDailyRegularHotelWeekValue();

        return hostingValue;
    }


    public double returnRewardsHostingDayValue(String day) {
        double hostingValue;

        if (weekendDay.isWeekend(day)) {
            hostingValue = getDailyRewardsHotelWeekendValue();
        } else
            hostingValue = getDailyRewardsHotelWeekValue();

        return hostingValue;
    }


    public double calculateHostingValue(ClientType clientType, List<String> days) {


        double hostingValue = 0;

        for (String hostingDay : days) {

            if (clientType.equals(clientType.REGULAR)) {
                hostingValue += returnRegularHostingDayValue(hostingDay);

            } else {
                hostingValue += returnRewardsHostingDayValue(hostingDay);
            }
        }

        return hostingValue;
    }
}
