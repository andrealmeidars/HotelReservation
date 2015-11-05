package week.period;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class WeekPeriodTest{
    WeekPeriod weekPeriod;

    @Before
    public void setUp() throws Exception {
        this.weekPeriod = new WeekPeriod();

    }

    @Test
    public void showInfoWeekendSendSat(){

        assertTrue(weekPeriod.isWeekend("sat"));
       // assertThat(weekPeriod.returnWeekOrWeekend("sat"), is("weekend"));
    }

    @Test
    public void showInfoWeekSendMon(){
        assertFalse(weekPeriod.isWeekend("mon"));
        //assertThat(weekPeriod.returnWeekOrWeekend("mon"), is("week"));
    }

}