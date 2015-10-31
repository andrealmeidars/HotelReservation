package client.type;




import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class ClientTypeTest  {
    ClientType clientType;



    @Before
    public void setUp() throws Exception {
        this.clientType = new ClientType();
    }


    @Test
    public void returnRegularTypeClient(){

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);

        assertThat(clientType.returnTypeClient(), is("Regular"));


    }

}