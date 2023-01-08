package lap_07_2;

import java.util.ArrayList;
import java.util.List;

public class RaceAnimalController {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);

        System.out.println(animalList.toString());

        String result = getAnimalWinner(animalList);
        System.out.println(result);


    }

    public static String getAnimalWinner(List<Animal> animalList) {
        int animalWinnerSpeed = animalList.get(0).getSpeed();
        String animalWinnerName = animalList.get(0).getName();

        for (Animal animal : animalList) {
            if (animal.getSpeed() > animalWinnerSpeed) {
                animalWinnerSpeed = animal.getSpeed();
                animalWinnerName = animal.getName();
            }
        }

        return "Winner is " + animalWinnerName + ", with speed: " + animalWinnerSpeed;
    }
}
