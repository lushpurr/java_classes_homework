import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void setUp(){ waterBottle = new WaterBottle(100);}

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){

        assertEquals(90, waterBottle.drink());
    }

//    @Test
//    public void canEmpty(){
//        int volumeAfterEmpty = waterBottle.Empty();
//        assertEquals(0, volumeAfterEmpty);
//    }



}
