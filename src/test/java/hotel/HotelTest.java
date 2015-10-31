package hotel;


import tiny.types.DailyRatePremiumHotelValue;
import tiny.types.DailyRateRegularHotelValue;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HotelTest {

    Hotel myHotel;



    @Before
    public void setUp() throws Exception {
        this.myHotel = new Hotel("My Hotel Resort Viamão", 2,
                new DailyRateRegularHotelValue(110,100), new DailyRatePremiumHotelValue(90,80));

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
        String[] daysMonday = {"mon", "mon", "mon"};
        assertThat(myHotel.calculateHostingValue("Regular", daysMonday), is(330.0) );
    }


    @Test
    public void showHostingValueIfClientIsRegularAnd3DaysSat(){
        String[] daysSaturday = {"sat", "sat", "sat"};
        assertThat(myHotel.calculateHostingValue("Regular", daysSaturday), is(300.0) );
    }


    @Test
    public void showHostingValueIfClientIsPremiumAnd3DaysMon(){
        String[] daysMonday = {"mon", "mon", "mon"};
        assertThat(myHotel.calculateHostingValue("Premium", daysMonday), is(270.0) );
    }

    @Test
    public void showHostingValueIfClientIsPremiumAnd3DaysSat(){
        String[] daysSaturday = {"sat", "sat", "sat"};
        assertThat(myHotel.calculateHostingValue("Premium", daysSaturday), is(240.0) );
    }


    @Test
    public void showHotelName(){

        assertThat(myHotel.getHotelName(), is("My Hotel Resort Viamão"));
    }

}