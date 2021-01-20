package rgbledring;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LEDTest {

    @Test
    public void testFirstLedIsOn() {
    	LED led = new LED();
        boolean ledOn = led.slider1Value(5);
        assertTrue(ledOn);
    }
    
    @Test
    public void testFirstLedIsOff() {
    	LED led = new LED();
    	boolean ledOff = led.slider1Value(0);
    	assertThat(ledOff).isFalse();
    }

}
