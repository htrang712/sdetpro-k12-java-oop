package lap_08;

import java.security.SecureRandom;

public class Animal {
    protected String name;
    protected int speed;
    protected boolean flyable;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int randomSpeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed);
    }

    public String getAnimalName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }
}
