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

    @Test
    public void returnMonOptionDay(){

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);

        assertThat(days.returnDayHosting(), is ("mon"));

    }

    @Test
    public void returnTuesOptionDay(){

        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);

        assertThat(days.returnDayHosting(), is ("tues"));

    }

    @Test
    public void returnWedOptionDay(){

        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);

        assertThat(days.returnDayHosting(), is ("wed"));

    }

    @Test
    public void returnThurOptionDay(){

        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);

        assertThat(days.returnDayHosting(), is ("thur"));

    }

    @Test
    public void returnFriOptionDay(){

        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);

        assertThat(days.returnDayHosting(), is ("fri"));

    }

    @Test
    public void returnSatOptionDay(){

        ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
        System.setIn(in);

        assertThat(days.returnDayHosting(), is ("sat"));

    }

}