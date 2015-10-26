package model;


public class DailyRegularHotelValue {
    private double dailyRegularClientWeekValue;
    private double dailyRegularClientWeekendValue;

    public DailyRegularHotelValue(double dailyRegularClientWeekValue, double dailyRegularClientWeekendValue) {
        this.dailyRegularClientWeekValue = dailyRegularClientWeekValue;
        this.dailyRegularClientWeekendValue = dailyRegularClientWeekendValue;
    }

    public double getDailyRegularClientWeekValue() {
        return dailyRegularClientWeekValue;
    }

    public double getDailyRegularClientWeekendValue() {
        return dailyRegularClientWeekendValue;
    }
}
