package rgbledring;

import org.junit.jupiter.api.Test;

public class LedRingsTest {

    @Test

    void testGivenSliderIsZero()
    {
        givenLEDRingOfSize(16);
        whenLevelIsSet(2);
        thenLED1IsOn();
    }
}
