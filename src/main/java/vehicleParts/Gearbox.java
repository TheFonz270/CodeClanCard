package vehicleParts;

public class Gearbox {

    private int gears;
    private GearboxType gearboxType;

    public Gearbox(int _gears, GearboxType _gearboxType ){
        this.gears = _gears;
        this.gearboxType = _gearboxType;
    }

    public int getGears() {
        return gears;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }
}
