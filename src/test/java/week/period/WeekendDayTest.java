package week.period;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class WeekendDayTest {
    WeekendDay weekendDay;

    @Before
    public void setUp() throws Exception {
        this.weekendDay = new WeekendDay();

    }

    @Test
    public void showInfoWeekendSendSat(){

        assertTrue(weekendDay.isWeekend("sat"));

    }

    @Test
    public void showInfoWeekSendMon(){
        assertFalse(weekendDay.isWeekend("mon"));

    }

}