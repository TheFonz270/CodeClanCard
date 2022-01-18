package vehicles;

import vehicleParts.Engine;
import vehicleParts.Gearbox;
import vehicleParts.Tyres;

public abstract class Car {

    protected String make;
    protected String model;
    protected Engine engine;
    protected Gearbox gearbox;
    protected Tyres tyres;
    protected double price;
    protected String colour;
    protected double currentValue;

    public Car(String _make, String _model, Engine _engine, Gearbox _gearbox, Tyres _tyres, double _price, String _colour){
        this.make = _make;
        this.model = _model;
        this.engine = _engine;
        this.gearbox = _gearbox;
        this.tyres = _tyres;
        this.price = _price;
        this.colour = _colour;
        this.currentValue = _price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void getsDamaged(double damage){
        this.currentValue -= damage;
    }


}
