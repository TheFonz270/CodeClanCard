package people;

import java.util.ArrayList;
import vehicles.Car;

public class Dealership {
    private Double till;
    private ArrayList<Car> stock;

    public Dealership(Double _till){
        this.till = _till;
        this.stock = new ArrayList<>();
    }

    public Double getTill() {
        return till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void buyCar(Car _car){
        this.stock.add(_car);
    }

    public void sellCar(Car _car, Customer customer){
        this.stock.remove(_car);
        customer.buyCar(_car);
    }
}
