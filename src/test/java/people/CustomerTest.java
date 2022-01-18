package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import vehicleParts.*;
import vehicles.Car;
import vehicles.CarElectric;
import vehicles.CarHybrid;
import vehicles.CarPetrol;

import javax.smartcardio.CardPermission;

public class CustomerTest {

    private Engine engineP1;
    private Gearbox gearbox1;
    private Tyres tyres1;

    private CarPetrol carP1;

    private ArrayList<Car> collection;

    private Double funds;

    private Customer customer;

    @Before
    public void before(){
        engineP1 = new Engine(8, 200, EngineType.PETROL);
        gearbox1 = new Gearbox(5, GearboxType.MANUAL);
        tyres1 = new Tyres(TyresManufacturer.GOODYEAR,TyresType.SUMMER);

        carP1 = new CarPetrol("Toyota","Yaris",engineP1, gearbox1,tyres1, 6000, "red");

        customer = new Customer(20000.00);
    }

    @Test
    public void customerHasFunds(){
        assertEquals(20000, customer.getFunds(), 0);
    }

    @Test
    public void customerCollectionStartsEmpty(){
        assertEquals(0, customer.getCollection().size());
    }

    @Test
    public void customerCanBuyCar(){
        customer.buyCar(carP1);
        assertEquals(1, customer.getCollection().size());
    }


}
