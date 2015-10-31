package days;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class DaysTest  {
    Days days;

    @Before
    public void setUp() {
        this.days = new Days();
    }


    @Test
    public void returnSunOptionDay(){

        ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
        System.setIn(in);

        assertThat(days.returnDayHosting(), is ("sun"));

    }

}