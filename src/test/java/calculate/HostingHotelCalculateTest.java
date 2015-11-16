package calculate;


import calculate.daily.HostingHotelCalculate;
import client.type.ClientType;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HostingHotelCalculateTest {
    HostingHotelCalculate hostingHotelCalculate;
    List<String> daysLakewood = new LinkedList<>();
    List<String> daysBridgewood = new LinkedList<>();
    List<String> daysRidgewood = new LinkedList<>();




    @Before
    public void setUp() throws Exception {
        this.hostingHotelCalculate = new HostingHotelCalculate();

    }


    @Test
    public void showCheapestLakewoodHotel () {
        daysLakewood.add("mon");
        daysLakewood.add("tues");
        daysLakewood.add("wed");

        assertThat(hostingHotelCalculate.findCheapestHotelToClient(ClientType.REGULAR, daysLakewood), is("Lakewood"));


    }

    @Test
    public void showCheapestBridgewoodHotel (){
        daysBridgewood.add("fri");
        daysBridgewood.add("sat");
        daysBridgewood.add("sun");

        assertThat(hostingHotelCalculate.findCheapestHotelToClient(ClientType.REGULAR, daysBridgewood), is ("Bridgewood"));

    }

    @Test
    public void showCheapestRidgewoodHotel (){
        daysRidgewood.add("thru");
        daysRidgewood.add("fri");
        daysRidgewood.add("sat");

        assertThat(hostingHotelCalculate.findCheapestHotelToClient(ClientType.REWARDS, daysRidgewood), is ("Ridgewood"));

    }


}






