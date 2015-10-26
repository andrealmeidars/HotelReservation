package hotel;

import junit.framework.TestCase;
import model.ClassificationHotelValue;
import model.DailyPremiumHotelValue;
import model.DailyRegularHotelValue;
import model.HotelName;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HotelTest {

    Hotel myHotel;

    @Before
    public void setUp() throws Exception {
        this.myHotel = new Hotel(new HotelName("My Hotel Resort Viamão"), new ClassificationHotelValue(2),
                                new DailyRegularHotelValue(110, 100),
                                new DailyPremiumHotelValue(90,80));
        }



    @Test
    public void showHostinValueIfClientIsRegularAndInMonday(){
        assertThat(myHotel.calculateHostingValue("Regular", "mon", "tues", "wed"), is(110.0) );

    }

    @Test
    public void showHostinValueIfClientIsPremiumAndInMonday(){
        assertThat(myHotel.calculateHostingValue("Premium", "mon", "tues", "wed"), is(90.0) );

    }

}