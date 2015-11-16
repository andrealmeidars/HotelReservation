package client.type;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ClientTypeTest  {


    @Test
    public void returnsTrueWhenRegularClientIsPassed() throws Exception {
        assertThat(ClientType.isRewardsClient("REWARDS"), is(true));
    }

    @Test
    public void returnsFalseWhenRegularClientIsPassed() throws Exception {
        assertThat(ClientType.isRewardsClient("REGULAR"), is(false));
    }

    @Test
    public void getsRewardsClient() throws Exception {
        assertThat(ClientType.getByType("REWARDS"), is(ClientType.REWARDS));

    }

    @Test
    public void getsRegularsClient() throws Exception {
        assertThat(ClientType.getByType("REGULAR"), is(ClientType.REGULAR));

    }
}