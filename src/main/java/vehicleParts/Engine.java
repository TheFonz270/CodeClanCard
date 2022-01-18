package vehicleParts;

public class Engine {

    private int size;
    private int hp;
    private EngineType engineType;

    public Engine(int _size, int _hp, EngineType _engineType) {
        this.size = _size;
        this.hp = _hp;
        this.engineType = _engineType;
    }

    public int getSize() {
        return size;
    }

    public int getHp() {
        return hp;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
