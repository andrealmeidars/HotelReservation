package tiny.types;


public class fares {
    private double weekdayFare;
    private double dailyRateRegularClientWeekendValue;

    public fares(double weekdayFare, double dailyRateRegularClientWeekendValue) {
        this.weekdayFare = weekdayFare;
        this.dailyRateRegularClientWeekendValue = dailyRateRegularClientWeekendValue;
    }

    public double getWeekdayFare() {
        return weekdayFare;
    }

    public double getDailyRateRegularClientWeekendValue() {
        return dailyRateRegularClientWeekendValue;
    }
}
