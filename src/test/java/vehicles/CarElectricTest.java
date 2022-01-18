package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicleParts.*;

import static org.junit.Assert.assertEquals;

public class CarElectricTest {

    private Engine engine1;
    private Gearbox gearbox1;
    private Tyres tyres1;
    private Car eCar;

    @Before
    public void before(){
        engine1 = new Engine(6, 180, EngineType.ELECTRIC);
        gearbox1 = new Gearbox(6, GearboxType.AUTOMATIC);
        tyres1 = new Tyres(TyresManufacturer.GOODYEAR, TyresType.SUMMER);

        eCar = new CarElectric("Nissan", "E-Auto", engine1, gearbox1, tyres1, 27000.00, "blue");

    }

    @Test
    public void ElectricCarExists(){
        assertEquals("Nissan E-Auto", eCar.getMake() + " " + eCar.getModel());
        assertEquals(180, eCar.getEngine().getHp());
        assertEquals(GearboxType.AUTOMATIC, eCar.getGearbox().getGearboxType());
        assertEquals(TyresManufacturer.GOODYEAR, eCar.getTyres().getManufacturer());
    }
}
