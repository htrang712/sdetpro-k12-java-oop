package lap_08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RaceAnimalController {
    public static void main(String[] args) {

        Animal horse = new Horse.Builder().setName().setSpeed().setFlyable().build();
        Animal tiger = new Tiger.Builder().setName().setSpeed().setFlyable().build();
        Animal dog = new Dog.Builder().setName().setSpeed().setFlyable().build();
        Animal bird = new Bird.Builder().setName().setSpeed().setFlyable().build();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);
        animalList.add(bird);

        System.out.println(animalList.toString());

        List<Animal> raceAnimalList = getRaceAnimalList(animalList);

        System.out.println(raceAnimalList.toString());

        String resultRace = getAnimalWinner(raceAnimalList);

        System.out.println(resultRace);

    }

    public static List<Animal> getRaceAnimalList(List<Animal> animalList) {
        List<Animal> raceAnimalList = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable())
                raceAnimalList.add(animal);
        }
        return raceAnimalList;
    }

    public static String getAnimalWinner(List<Animal> raceAnimalList) {
        int animalWinnerSpeed = raceAnimalList.get(0).getSpeed();
        String animalWinnerName = raceAnimalList.get(0).getName();
        for (Animal animal : raceAnimalList) {
            if (animal.getSpeed() > animalWinnerSpeed) {
                animalWinnerSpeed = animal.getSpeed();
                animalWinnerName = animal.getName();
            }
        }
        return "Winner is " + animalWinnerName + ", with speed: " + animalWinnerSpeed;
    }
}
