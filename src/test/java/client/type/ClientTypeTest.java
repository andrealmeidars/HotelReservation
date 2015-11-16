package client.type;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class ClientTypeTest  {





    @Test
    public void showIfClientIsRegular(){
        assertThat(ClientType.getByType("REGULAR"), is (ClientType.REGULAR));

    }

    @Test
    public void showIfClientIsRewards(){
        assertThat(ClientType.getByType("REWARDS"), is (ClientType.REWARDS));

    }


}