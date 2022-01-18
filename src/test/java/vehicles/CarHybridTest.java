package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicleParts.*;

import static org.junit.Assert.assertEquals;

public class CarHybridTest {

    private Engine engine1;
    private Engine engine2;
    private Gearbox gearbox1;
    private Tyres tyres1;
    private CarHybrid hCar;

    @Before
    public void before(){
        engine1 = new Engine(6, 180, EngineType.ELECTRIC);
        engine2 = new Engine(4, 120, EngineType.PETROL);
        gearbox1 = new Gearbox(6, GearboxType.AUTOMATIC);
        tyres1 = new Tyres(TyresManufacturer.GOODYEAR, TyresType.SUMMER);

        hCar = new CarHybrid("Nissan", "H-Auto", engine1, engine2, gearbox1, tyres1, 27000.00, "blue");

    }

    @Test
    public void ElectricCarExists(){
        assertEquals("Nissan H-Auto", hCar.getMake() + " " + hCar.getModel());
        assertEquals(180, hCar.getEngine1().getHp());
        assertEquals(120, hCar.getEngine2().getHp());
        assertEquals(GearboxType.AUTOMATIC, hCar.getGearbox().getGearboxType());
        assertEquals(TyresManufacturer.GOODYEAR, hCar.getTyres().getManufacturer());
    }
}
