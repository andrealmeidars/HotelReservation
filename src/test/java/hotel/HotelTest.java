package hotel;


import tiny.types.DailyRatePremiumHotelValue;
import tiny.types.DailyRateRegularHotelValue;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
                new DailyRateRegularHotelValue(110,100), new DailyRatePremiumHotelValue(90,80));
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
        assertThat(myHotel.returnPremiumHostingDayValue("sun"), is (80.0));
    }

    @Test
    public void returnValueIfDaysWeekAndPremiumClient(){
        assertThat(myHotel.returnPremiumHostingDayValue("mon"), is (90.0));
    }

    @Test
    public void showHostingValueIfClientIsRegularAnd3DaysMon(){

        assertThat(myHotel.calculateHostingValue(isRegularClient, daysMonday), is(330.0) );
    }


    @Test
    public void showHostingValueIfClientIsRegularAnd3DaysSat(){

        assertThat(myHotel.calculateHostingValue(isRegularClient, daysSaturday), is(300.0) );
    }


    @Test
    public void showHostingValueIfClientIsPremiumAnd3DaysMon(){

        assertThat(myHotel.calculateHostingValue(isRegularClienteFalse, daysMonday), is(270.0) );
    }

    @Test
    public void showHostingValueIfClientIsPremiumAnd3DaysSat(){

        assertThat(myHotel.calculateHostingValue(isRegularClienteFalse, daysSaturday), is(240.0) );
    }


//    @Test
//    public void showHotelName(){
//
//        assertThat(myHotel.getHotelName(), is("My Hotel Resort Viamão"));
//    }

}