package lap_07_2;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

public class Animal {
    private int speed;
    private int maxSpeed;
    private String name;

    public Animal() {
    }

    public Animal(int speed, int maxSpeed, String name) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int randomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }

    public String getAnimalName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
