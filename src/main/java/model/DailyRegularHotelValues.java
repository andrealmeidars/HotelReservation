package model;


public class DailyRegularHotelValues {
    private double dailyRegularClientWeekValue;
    private double dailyRegularClientWeekendValue;

    public DailyRegularHotelValues(double dailyRegularClientWeekValue) {
        this.dailyRegularClientWeekValue = dailyRegularClientWeekValue;
    }

    public double getDailyRegularClientWeekValue() {
        return dailyRegularClientWeekValue;
    }

    public double getDailyRegularClientWeekendValue() {
        return dailyRegularClientWeekendValue;
    }
}
