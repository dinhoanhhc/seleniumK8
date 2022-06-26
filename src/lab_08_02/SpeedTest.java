package lab_08_02;

import java.util.Arrays;
import java.util.List;

public class SpeedTest {

    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println(horse.getNameAnimal() + " with speed is " + horse.getSpeed());

        Tiger tiger = new Tiger();
        System.out.println(tiger.getNameAnimal() + " with speed is " + tiger.getSpeed());

        Dog dog = new Dog();
        System.out.println(dog.getNameAnimal() + " with speed is " + dog.getSpeed());

        new SpeedTest().maxSpeedAnimal(Arrays.asList(horse, tiger, dog));
    }

    public void maxSpeedAnimal(List<Animal> animalList) {
        int maxSpeedAnimal = animalList.get(0).getSpeed();
        String maxNameAnimal = animalList.get(0).getNameAnimal();
        for (Animal animal : animalList) {
            if (animal.getSpeed() > maxSpeedAnimal) {
                maxSpeedAnimal = animal.getSpeed();
                maxNameAnimal = animal.getNameAnimal();
            }
        }
        System.out.println("Winner is " + maxNameAnimal + " with speed: " + maxSpeedAnimal);

    }
}
