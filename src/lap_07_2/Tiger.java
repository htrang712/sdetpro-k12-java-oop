package lap_07_2;

public class Tiger extends Animal {

    private static int MAX_SPEED = 100;

    public Tiger() {
        super();
        super.setSpeed(super.randomSpeed(MAX_SPEED));
        super.setName(super.getAnimalName());
    }
}
