package vehicleParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before(){
        engine = new Engine(6, 270, EngineType.PETROL);
    }

    @Test
    public void engineExists(){
        assertEquals(270, engine.getHp());
        assertEquals(6, engine.getSize());
        assertEquals(EngineType.PETROL, engine.getEngineType());
    }
}
