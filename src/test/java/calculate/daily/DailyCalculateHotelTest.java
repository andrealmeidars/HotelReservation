package calculate.daily;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DailyCalculateHotelTest {

        DailyCalculateHotel dailyCalculateHotel;


    @Before
    public void setUp() throws Exception {
        this.dailyCalculateHotel = new DailyCalculateHotel();

    }

    @Test
    public void showLakewoodIfSendRegularTypeAnd3WeekDays(){
        assertThat(dailyCalculateHotel.dailyCalculate("Regular","mon","tues", "wed"), is ("Lakewood"));
    }

    @Test
    public void showBridgewoodIfSendRegularTypeAnd1WeekDayAndWeekend(){
        assertThat(dailyCalculateHotel.dailyCalculate("Regular","fri","sat", "sun"), is("Bridgewood"));
    }


}