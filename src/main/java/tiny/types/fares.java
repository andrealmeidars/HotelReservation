package tiny.types;


public class Fares {
    private final double weekdayFare;
    private final double weekendFare;

    public Fares(double weekdayFare, double weekendFare) {
        this.weekdayFare = weekdayFare;
        this.weekendFare = weekendFare;
    }

    public double getWeekdayFare() {
        return weekdayFare;
    }

    public double getWeekendFare() {
        return weekendFare;
    }
}
