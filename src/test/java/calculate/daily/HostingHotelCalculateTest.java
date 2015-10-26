package calculate.daily;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HostingHotelCalculateTest {

        HostingHotelCalculate hostingHotelCalculate;


    @Before
    public void setUp() throws Exception {
        this.hostingHotelCalculate = new HostingHotelCalculate();

    }

    @Test
    public void showLakewoodIfSendRegularTypeAnd3WeekDays(){
        assertThat(hostingHotelCalculate.dailyCalculate("Regular","mon","tues", "wed"), is ("Lakewood"));
    }

    @Test
    public void showBridgewoodIfSendRegularTypeAnd1WeekDayAndWeekend(){
        assertThat(hostingHotelCalculate.dailyCalculate("Regular","fri","sat", "sun"), is("Bridgewood"));
    }


}