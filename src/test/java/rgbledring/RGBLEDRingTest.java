package rgbledring;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class RGBLEDRingTest {

    @Test
    public void testFirstLedIsOn() {
    	
    	RGBLEDRing ring = new RGBLEDRing();
    	
        boolean led1On = ring.slider1Value(5);
        
        assertTrue(led1On);
    }

}
