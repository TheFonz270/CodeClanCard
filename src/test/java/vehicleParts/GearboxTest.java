package vehicleParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {

    private Gearbox gearbox;

    @Before
    public void before(){
        gearbox = new Gearbox(5, GearboxType.MANUAL);
    }

    @Test
    public void gearboxExists(){
        assertEquals(5, gearbox.getGears());
        assertEquals(GearboxType.MANUAL, gearbox.getGearboxType());
    }
}
