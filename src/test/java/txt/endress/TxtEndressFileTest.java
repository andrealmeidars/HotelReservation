package txt.endress;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TxtEndressFileTest{

    @Test
    public void getFileEndress(){
        TxtEndressFile endressFile = new TxtEndressFile();
        assertThat(endressFile.getEndress(), is("src/main/java/file/file.txt"));
    }

}