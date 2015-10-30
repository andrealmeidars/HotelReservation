package tiny.types;


public class DailyRateRegularHotelValue {
    private double dailyRateRegularClientWeekValue;
    private double dailyRateRegularClientWeekendValue;

    public DailyRateRegularHotelValue(double dailyRateRegularClientWeekValue, double dailyRateRegularClientWeekendValue) {
        this.dailyRateRegularClientWeekValue = dailyRateRegularClientWeekValue;
        this.dailyRateRegularClientWeekendValue = dailyRateRegularClientWeekendValue;
    }

    public double getDailyRateRegularClientWeekValue() {
        return dailyRateRegularClientWeekValue;
    }

    public double getDailyRateRegularClientWeekendValue() {
        return dailyRateRegularClientWeekendValue;
    }
}
