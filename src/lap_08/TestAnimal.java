package lap_08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {

        Animal tiger = new Animal.Builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(100)).setFlyable(false).build();
        Animal horse = new Animal.Builder().setName("Horse").setSpeed(new SecureRandom().nextInt(75)).setFlyable(false).build();
        Animal dog = new Animal.Builder().setName("Dog").setSpeed(new SecureRandom().nextInt(60)).setFlyable(false).build();
        Animal bird = new Animal.Builder().setName("Bird").setSpeed(new SecureRandom().nextInt(70)).setFlyable(true).build();
        Animal penguin = new Animal.Builder().setName("Penguin").setSpeed(new SecureRandom().nextInt(30)).setFlyable(false).build();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(dog);
        animalList.add(bird);
        animalList.add(penguin);

        List<Animal> raceAnimalList = getRaceAnimalList(animalList);

        String animalWinner = getAnimalWinner(raceAnimalList);

        System.out.println("List of animals: " + animalList.toString());
        System.out.println("List of animals participating in the race: " + raceAnimalList.toString());
        System.out.println(animalWinner);

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
