package tiny.types;


public class DailyRatePremiumHotelValue {
    private double dailyRatePremiumClientWeekValue;
    private double dailyRatePremiumClientWeekendValue;

    public DailyRatePremiumHotelValue(double dailyRatePremiumClientWeekValue, double dailyRatePremiumClientWeekendValue) {
        this.dailyRatePremiumClientWeekValue = dailyRatePremiumClientWeekValue;
        this.dailyRatePremiumClientWeekendValue = dailyRatePremiumClientWeekendValue;
    }

    public double getDailyRatePremiumClientWeekValue() {
        return dailyRatePremiumClientWeekValue;
    }

    public double getDailyRatePremiumClientWeekendValue() {
        return dailyRatePremiumClientWeekendValue;
    }
}
