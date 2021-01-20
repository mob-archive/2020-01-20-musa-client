package rgbledring;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class RGBLEDRingTest {

    @Test
    public void testFirstLedIsOn() {
    	
    	RGBLEDRing led = new RGBLEDRing(1);
    	
        boolean led1On = led.slider1Value(5);
        
        assertTrue(led1On);
    }
    
    @Test
    public void testFirstLedIsOff() {
    	
    	RGBLEDRing led = new RGBLEDRing(1);
    	
    	boolean led1Off = led.slider1Value(0);
    	
    	assertThat(led1Off).isFalse();
    }

}
