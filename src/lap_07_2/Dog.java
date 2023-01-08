package lap_07_2;

public class Dog extends Animal {

    private static int MAX_SPEED = 60;

    public Dog() {
        super();
        super.setSpeed(super.randomSpeed(MAX_SPEED));
        super.setName(super.getAnimalName());
    }
}
