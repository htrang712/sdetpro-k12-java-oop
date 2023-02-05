package lap_11;

public class Dog extends Animal {

    public Dog(String name, int speed) {
        super(name, speed);
        flyAble = new FlyNoWay();
    }
}
