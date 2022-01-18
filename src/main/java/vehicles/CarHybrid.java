package vehicles;

import vehicleParts.Engine;
import vehicleParts.Gearbox;
import vehicleParts.Tyres;

public class CarHybrid extends Car{

    protected Engine engine2;

    public CarHybrid(String make, String model, Engine engine1, Engine engine2, Gearbox gearbox, Tyres tyres, double price, String colour){
        super(make, model, engine1, gearbox, tyres, price, colour);
        this.engine2 = engine2;
    }

    public Engine getEngine1() {
        return engine;
    }
    
    public Engine getEngine2() {
        return engine2;
    }
}