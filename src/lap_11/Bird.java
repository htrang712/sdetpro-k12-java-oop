package lap_11;

public class Bird extends Animal {

    public Bird(String name, int speed) {
        super(name, speed);
        flyAble = new FlyWithWing();
    }
}
