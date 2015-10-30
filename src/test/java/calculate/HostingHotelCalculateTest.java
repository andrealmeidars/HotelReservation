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
        String[] daysLakewood = {"mon", "tues", "wed"};
        assertThat(hostingHotelCalculate.calculateHotels("Regular", daysLakewood), is("Lakewood"));


    }

    @Test
    public void showCheapestBridgewoodHotel (){
        String[] daysBridgewood = {"fri", "sat", "sun"};
        assertThat(hostingHotelCalculate.calculateHotels("Regular", daysBridgewood), is ("Bridgewood"));

    }

    @Test
    public void showCheapestRidgewoodHotel (){
        String[] daysRidgewood = {"thru", "fri", "sat"};
        assertThat(hostingHotelCalculate.calculateHotels("Premium", daysRidgewood), is ("Ridgewood"));

    }







}
