package model;


public class DailyPremiumHotelValues {
    private double dailyPremiumClientWeekValue;
    private double dailyPremiumClientWeekendValue;

    public DailyPremiumHotelValues(double dailyPremiumClientWeekValue, double dailyPremiumClientWeekendValue) {
        this.dailyPremiumClientWeekValue = dailyPremiumClientWeekValue;
        this.dailyPremiumClientWeekendValue = dailyPremiumClientWeekendValue;
    }

    public double getDailyPremiumClientWeekValue() {
        return dailyPremiumClientWeekValue;
    }

    public double getDailyPremiumClientWeekendValue() {
        return dailyPremiumClientWeekendValue;
    }
}
