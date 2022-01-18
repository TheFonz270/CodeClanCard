package vehicleParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    private Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(TyresManufacturer.GOODYEAR, TyresType.WINTER);
    }

    @Test
    public void tyresExist(){
        assertEquals(TyresManufacturer.GOODYEAR, tyres.getManufacturer());
        assertEquals(TyresType.WINTER, tyres.getType());
    }
}
