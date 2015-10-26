package model;


public class DailyPremiumHotelValue {
    private double dailyPremiumClientWeekValue;
    private double dailyPremiumClientWeekendValue;

    public DailyPremiumHotelValue(double dailyPremiumClientWeekValue, double dailyPremiumClientWeekendValue) {
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
