package week.period;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WeekPeriodTest{
    WeekPeriod weekPeriod;

    @Before
    public void setUp() throws Exception {
        this.weekPeriod = new WeekPeriod();

    }

    @Test
    public void showInfoWeekendSendSat(){
        assertThat(weekPeriod.returnWeekPeriod("Sat"), is("weekend"));
    }

}