import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void setUp(){
        printer = new Printer(200);
    }

    @Test
    public void canPrint(){
        assertEquals(190, printer.print(10));
    }
}
