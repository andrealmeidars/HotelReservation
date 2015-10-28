package hotel;


import model.DailyRatePremiumHotelValue;
import model.DailyRateRegularHotelValue;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HotelTest {

    Hotel myHotel;
    Hotel hotelDay;


    @Before
    public void setUp() throws Exception {
        this.myHotel = new Hotel("My Hotel Resort Viamão", 2,
                new DailyRateRegularHotelValue(110,100), new DailyRatePremiumHotelValue(90,80));
        this.hotelDay = new Hotel("My Hotel Resort Viamão", 2,
                new DailyRateRegularHotelValue(110,100), new DailyRatePremiumHotelValue(90,80));



     }



    @Test
    public void returnValueIfDaysWeekendAndRegularClient(){
        assertThat(hotelDay.returnRegularHostingDayValue("sun"), is (100.0));
    }


    @Test
    public void returnValueIfDaysWeekdAndRegularClient(){
        assertThat(hotelDay.returnRegularHostingDayValue("mon"), is (110.0));
    }


    @Test
    public void showHostingValueIfClientIsRegularAnd3DaysMon(){
        assertThat(myHotel.calculateHostingValue("Regular", "mon", "mon", "mon"), is(330.0) );
    }


    @Test
    public void showHostingValueIfClientIsRegularAnd3DaysSat(){
        assertThat(myHotel.calculateHostingValue("Regular", "sat", "sat", "sat"), is(300.0) );
    }


    @Test
    public void showHostingValueIfClientIsPremiumAnd3DaysMon(){
        assertThat(myHotel.calculateHostingValue("Premium", "mon", "mon", "mon"), is(270.0) );
    }

    @Test
    public void showHostingValueIfClientIsPremiumAnd3DaysSat(){
        assertThat(myHotel.calculateHostingValue("Premium", "sat", "sat", "sat"), is(240.0) );
    }







}