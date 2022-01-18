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

public class DealershipTest {

    private Engine engineP1;
    private Engine engineE1;
    private Engine engineP2;
    private Engine engineE2;

    private Gearbox gearbox1;
    private Gearbox gearbox2;
    private Gearbox gearbox3;

    private Tyres tyres1;
    private Tyres tyres2;
    private Tyres tyres3;

    private CarPetrol carP1;
    private CarElectric carE1;
    private CarHybrid carH1;

    private ArrayList<Car> stock;

    private Double till;

    private Dealership dealership;

    private Customer customer;

    @Before
    public void before(){
        engineP1 = new Engine(4, 70, EngineType.PETROL);
        engineE1 = new Engine(4, 130, EngineType.ELECTRIC);
        engineP2 = new Engine(8, 200, EngineType.PETROL);
        engineE2 = new Engine(8, 200, EngineType.ELECTRIC);

        gearbox1 = new Gearbox(5, GearboxType.MANUAL);
        gearbox2 = new Gearbox(6, GearboxType.MANUAL);
        gearbox3 = new Gearbox(6, GearboxType.AUTOMATIC);

        tyres1 = new Tyres(TyresManufacturer.GOODYEAR,TyresType.SUMMER);
        tyres2 = new Tyres(TyresManufacturer.FIRESTONE,TyresType.WINTER);
        tyres3 = new Tyres(TyresManufacturer.MICHELIN,TyresType.SUMMER);

        carP1 = new CarPetrol("Toyota","Yaris",engineP1, gearbox1,tyres1, 16000, "red");
        carE1 = new CarElectric("Tesla", "Series X", engineE2, gearbox2, tyres2, 70000, "white");
        carH1 = new CarHybrid("BMW","M5", engineP2, engineE2, gearbox3, tyres3, 125000, "black");

        dealership = new Dealership(350000.00);

        customer = new Customer(20000.00);


    }

    @Test
    public void dealershipHasTill(){
        assertEquals(350000, dealership.getTill(), 0);
    }

    @Test
    public void dealershipStartsWithEmptyStock(){
        assertEquals(0, dealership.getStock().size());
    }

    @Test
    public void dealershipCanBuyCar(){
        dealership.buyCar(carP1);
        dealership.buyCar(carE1);
        dealership.buyCar(carH1);
        assertEquals(3, dealership.getStock().size());
    }

    @Test
    public void dealershipCanSellCar(){
        dealership.buyCar(carP1);
        dealership.buyCar(carE1);
        dealership.buyCar(carH1);
        assertEquals(3, dealership.getStock().size());
        assertEquals(0, customer.getCollection().size());
        dealership.sellCar(carP1, customer);
        assertEquals(2, dealership.getStock().size());
        assertEquals(1, customer.getCollection().size());
    }

    @Test
    public void CustomerCantAfford(){
        dealership.buyCar(carE1);
        assertEquals(1, dealership.getStock().size());
        assertEquals(0, customer.getCollection().size());
        assertEquals(350000, dealership.getTill(),0);
        assertEquals(20000, customer.getFunds(),0);
        dealership.sellCar(carE1, customer);
        assertEquals(1, dealership.getStock().size());
        assertEquals(0, customer.getCollection().size());
        assertEquals(350000, dealership.getTill(),0);
        assertEquals(20000, customer.getFunds(),0);
    }


}