package lap_08;

public class Dog extends Animal {
    public static int MAX_SPEED = 60;
    public static boolean FLYABLE = false;

    public Dog() {
        super();
    }

    protected Dog(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;

    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        public Builder setName() {
            this.name = build().getAnimalName();
            return this;
        }

        public Builder setSpeed() {
            this.speed = build().randomSpeed(MAX_SPEED);
            return this;
        }

        public Builder setFlyable() {
            this.flyable = FLYABLE;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }

}
