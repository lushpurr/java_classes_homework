import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator1;

    @Before
    public void setUp(){ calculator1= new Calculator(4, 6); }

    @Test
    public void canAddTwoNumbers(){
        assertEquals(10, calculator1.addTwoNumbers());
    }

    @Test
    public void canSubtractTwoNumbers(){
        assertEquals(-2, calculator1.subtractTwoNumbers());
    }


}
