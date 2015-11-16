package hotel;


import client.type.ClientType;
import tiny.types.Fares;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HotelTest {

    Hotel myHotel;
    boolean isRegularClient;
    boolean isRegularClienteFalse;

    List<String> daysMonday =  new LinkedList<>();
    List<String> daysSaturday = new LinkedList<>();




    @Before
    public void setUp() throws Exception {
        this.myHotel = new Hotel("My Hotel Resort Viamão", 2,
                new Fares(110,100), new Fares(90,80));


        this.isRegularClient = true;
        this.isRegularClienteFalse = false;

        daysMonday.add("mon");
        daysMonday.add("mon");
        daysMonday.add("mon");

        daysSaturday.add("sat");
        daysSaturday.add("sat");
        daysSaturday.add("sat");
     }

    @Test
    public void returnValueIfDaysWeekendAndRegularClient(){
        assertThat(myHotel.returnRegularHostingDayValue("sun"), is (100.0));
    }


    @Test
    public void returnValueIfDaysWeekdAndRegularClient(){
        assertThat(myHotel.returnRegularHostingDayValue("mon"), is (110.0));
    }

    @Test
    public void returnValueIfDaysWeekendAndPremiumClient(){
        assertThat(myHotel.returnRewardsHostingDayValue("sun"), is (80.0));
    }

    @Test
    public void returnValueIfDaysWeekAndPremiumClient(){
        assertThat(myHotel.returnRewardsHostingDayValue("mon"), is (90.0));
    }

    @Test
    public void showHostingValueIfClientIsRegularAnd3DaysMon(){

        assertThat(myHotel.calculateHostingValue(ClientType.REGULAR, daysMonday), is(330.0) );
    }
    @Test
    public void showHostingValueIfClientIsRegularAnd3DaysSat(){

        assertThat(myHotel.calculateHostingValue(ClientType.REGULAR, daysSaturday), is(300.0) );
    }


    @Test
    public void showHostingValueIfClientIsPremiumAnd3DaysMon(){

        assertThat(myHotel.calculateHostingValue(ClientType.REWARDS, daysMonday), is(270.0) );
    }

    @Test
    public void showHostingValueIfClientIsPremiumAnd3DaysSat(){

        assertThat(myHotel.calculateHostingValue(ClientType.REWARDS, daysSaturday), is(240.0) );
    }




}