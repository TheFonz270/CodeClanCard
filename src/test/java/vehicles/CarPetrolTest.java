package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicleParts.*;

import static org.junit.Assert.assertEquals;

public class CarPetrolTest {

    private Engine engine1;
    private Gearbox gearbox1;
    private Tyres tyres1;
    private Car pCar;

    @Before
    public void before(){
        engine1 = new Engine(8, 220, EngineType.PETROL);
        gearbox1 = new Gearbox(6, GearboxType.MANUAL);
        tyres1 = new Tyres(TyresManufacturer.GOODYEAR, TyresType.SUMMER);

        pCar = new CarElectric("Nissan", "P-MANUAL", engine1, gearbox1, tyres1, 27000.00, "blue");

    }

    @Test
    public void ElectricCarExists(){
        assertEquals("Nissan P-MANUAL", pCar.getMake() + " " + pCar.getModel());
        assertEquals(220, pCar.getEngine().getHp());
        assertEquals(GearboxType.MANUAL, pCar.getGearbox().getGearboxType());
        assertEquals(TyresManufacturer.GOODYEAR, pCar.getTyres().getManufacturer());
    }

    @Test
    public void carGetsDamaged(){
        assertEquals(27000, pCar.getPrice(), 0);
        assertEquals(27000, pCar.getCurrentValue(), 0);
        pCar.getsDamaged(5000);
        assertEquals(27000, pCar.getPrice(), 0);
        assertEquals(22000, pCar.getCurrentValue(), 0);
    }
}
