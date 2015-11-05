package calculate;


import calculate.daily.HostingHotelCalculate;
import hotel.Hotel;
import hotel.HotelList;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.theInstance;
import static org.hamcrest.MatcherAssert.assertThat;

public class HostingHotelCalculateTest {
    HostingHotelCalculate hostingHotelCalculate;
    boolean isRegularClient;
    boolean isRegularClienteFalse;
    List<String> daysLakewood = new LinkedList<>();
    List<String> daysBridgewood = new LinkedList<>();
    List<String> daysRidgewood = new LinkedList<>();




    @Before
    public void setUp() throws Exception {
        this.hostingHotelCalculate = new HostingHotelCalculate();
        this.isRegularClient = true;
        this.isRegularClienteFalse = false;


    }


    @Test
    public void showCheapestLakewoodHotel () {
        daysLakewood.add("mon");
        daysLakewood.add("tues");
        daysLakewood.add("wed");

        assertThat(hostingHotelCalculate.calculateHotels(isRegularClient, daysLakewood), is("Lakewood"));


    }

    @Test
    public void showCheapestBridgewoodHotel (){
        daysBridgewood.add("fri");
        daysBridgewood.add("sat");
        daysBridgewood.add("sun");

        assertThat(hostingHotelCalculate.calculateHotels(isRegularClient, daysBridgewood), is ("Bridgewood"));

    }

    @Test
    public void showCheapestRidgewoodHotel (){
        daysRidgewood.add("thru");
        daysRidgewood.add("fri");
        daysRidgewood.add("sat");

        assertThat(hostingHotelCalculate.calculateHotels(isRegularClienteFalse, daysRidgewood), is ("Ridgewood"));

    }


}






