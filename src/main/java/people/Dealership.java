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

    public String sellCar(Car _car, Customer customer){
        if (customer.getFunds() >= _car.getPrice()){
            this.stock.remove(_car);
            customer.buyCar(_car);
            this.collectMoney(_car);
            return "Transaction completed";
        } 
            return "insufficient funds, sorry. Go buy a bicycle";
        
    }

    public void repairCar(Car _car){
        this.till -= (_car.getPrice()- _car.getCurrentValue());
        _car.setCurrentValue(_car.getPrice());
    }
    
    public void collectMoney(Car _car){
        this.till += _car.getPrice();
    }
}
