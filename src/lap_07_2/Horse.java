package lap_07_2;

public class Horse extends Animal {
    private static int MAX_SPEED = 75;

    public Horse() {
        super();
        super.setSpeed(super.randomSpeed(MAX_SPEED));
        super.setName(super.getAnimalName());
    }
}
