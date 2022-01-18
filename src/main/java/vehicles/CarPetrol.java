package vehicles;

import vehicleParts.Engine;
import vehicleParts.Gearbox;
import vehicleParts.Tyres;

public class CarPetrol extends Car{

    public CarPetrol(String make,
                     String model,
                     Engine engine,
                     Gearbox gearbox,
                     Tyres tyres,
                     double price,
                     String colour){
        super(make, model, engine, gearbox, tyres, price, colour);
    }
}