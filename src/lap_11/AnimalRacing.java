package lap_11;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    public static String getAnimalWinner(List<Animal> animalList) {
        List<Animal> animalListNoFlyAble = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.flyablePerform())
                animalListNoFlyAble.add(animal);
        }

        int speedAnimalWinner = animalListNoFlyAble.get(0).getSpeed();
        String nameAnimalWinner = animalListNoFlyAble.get(0).getName();

        for (Animal animal : animalListNoFlyAble) {
            if (animal.getSpeed() > speedAnimalWinner) {
                speedAnimalWinner = animal.getSpeed();
                nameAnimalWinner = animal.getName();
            }
        }

        return "Winner is " + nameAnimalWinner + ", with speed: " + speedAnimalWinner;
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        Animal tiger = new Tiger("Tiger", new SecureRandom().nextInt(100));
        Animal dog = new Dog("Dog", new SecureRandom().nextInt(75));
        Animal bird = new Bird("Bird", new SecureRandom().nextInt(80));

        animalList.add(tiger);
        animalList.add(dog);
        animalList.add(bird);

        System.out.println(animalList);

        String animalWinner = getAnimalWinner(animalList);
        System.out.println(animalWinner);

    }
}
