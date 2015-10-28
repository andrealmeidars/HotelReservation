package calculate;


import calculate.daily.HostingHotelCalculate;
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
    public void showCheapestLakewoodHotel (){
        assertThat(hostingHotelCalculate.calculateHotels("Regular", "mon", "tues", "wed"), is ("Lakewood"));

    }


    @Test
    public void showCheapestBridgewoodHotel (){
        assertThat(hostingHotelCalculate.calculateHotels("Regular", "mon", "tues", "wed"), is ("Lakewood"));

    }




}
