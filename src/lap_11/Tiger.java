package lap_11;

public class Tiger extends Animal {

    public Tiger(String name, int speed) {
        super(name, speed);
        flyAble = new FlyNoWay();
    }
}
