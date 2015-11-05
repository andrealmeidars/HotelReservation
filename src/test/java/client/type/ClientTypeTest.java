package client.type;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


public class ClientTypeTest  {
    ClientType clientType;




    @Before
    public void setUp() throws Exception {
        this.clientType = new ClientType();

    }


    @Test
    public void returnRegularTypeClient() {
        clientType.insertTypeClient("Regular");
        assertTrue(clientType.returnCustomer());

    }


    @Test
    public void returnPremiumTypeClient() {
        clientType.insertTypeClient("Premium");
        assertFalse(clientType.returnCustomer());

    }


    }