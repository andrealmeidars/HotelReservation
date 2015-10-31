package printer;


import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;


public class PrinterTest{
    Printer printer;

    @Before
    public void setUp() throws Exception {
        this.printer = new Printer();

    }

    @Test
    public void printTest() {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        printer.printer("Hello Word");
        assertEquals("Hello Word", os.toString());
        System.setOut(originalOut);


    }

}