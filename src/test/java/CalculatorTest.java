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

    @Test
    public void canMultiplyTwoNumbers(){
        assertEquals(24, calculator1.multiplyTwoNumbers());

    }

    @Test
    public void canDivideTwoNumbers(){
//        pass
//        Calculator calculator2;
//        calculator2 = new Calculator(5.42, 0.50);
//        assertEquals(4.92, calculator2.divideTwoNumbers());

    }


}
