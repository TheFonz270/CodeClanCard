package people;

import java.util.ArrayList;
import vehicles.Car;

public class Customer {
    private Double funds;
    private ArrayList<Car> collection;

    public Customer(Double _funds){
        this.funds = _funds;
        this.collection = new ArrayList<>();
    }

    public Double getFunds() {
        return funds;
    }

    public ArrayList<Car> getCollection() {
        return collection;
    }

    public void buyCar(Car _car){
        this.collection.add(_car);
    }
}
