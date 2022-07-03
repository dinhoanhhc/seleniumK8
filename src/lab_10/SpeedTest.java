package lab_10;

import java.util.Arrays;
import java.util.List;

public class SpeedTest {

    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.nameAnimal() + " with speed is " + dog.speed());
        Animal horse = new Horse();
        System.out.println(horse.nameAnimal() + " with speed is " + horse.speed());
        Animal tiger = new Tiger();
        System.out.println(tiger.nameAnimal() + " with speed is " + tiger.speed());

        new SpeedTest().maxSpeedAnimal(Arrays.asList(horse, tiger, dog));
    }

    public void maxSpeedAnimal(List<Animal> animalList) {
        int maxSpeedAnimal = animalList.get(0).speed();
        String maxNameAnimal = animalList.get(0).nameAnimal();
        for (Animal animal : animalList) {
            if (animal.speed() > maxSpeedAnimal) {
                maxSpeedAnimal = animal.speed();
                maxNameAnimal = animal.nameAnimal();
            }
        }
        System.out.println("Winner is " + maxNameAnimal + " with speed: " + maxSpeedAnimal);

    }
}
