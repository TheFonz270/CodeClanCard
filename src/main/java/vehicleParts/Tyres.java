package vehicleParts;

public class Tyres {

    private TyresManufacturer manufacturer;
    private TyresType type;

    public Tyres(TyresManufacturer _manufacturer, TyresType _type) {
        this.manufacturer = _manufacturer;
        this.type = _type;
    }

    public TyresManufacturer getManufacturer() {
        return manufacturer;
    }

    public TyresType getType() {
        return type;
    }
}
