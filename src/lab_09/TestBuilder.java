package lab_09;

import lab_08_02.Animal;
import lab_08_02.SpeedTest;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class TestBuilder {

    public static void main(String[] args) {
        AnimalWithBuilder.Builder builder = new AnimalWithBuilder.Builder();
        AnimalWithBuilder tiger = builder
                .setNameAnimal("Tiger")
                .setSpeed(new SecureRandom().nextInt(100))
                .setWhithWings(false)
                .build();
        System.out.println(tiger.getNameAnimal() + " with speed is " + tiger.getSpeed());

        AnimalWithBuilder eagle = builder
                .setNameAnimal("Eagle")
                .setSpeed(new SecureRandom().nextInt(75))
                .setWhithWings(true)
                .build();
        System.out.println(eagle.getNameAnimal() + " with speed is " + eagle.getSpeed());

        AnimalWithBuilder falcon = builder
                .setNameAnimal("Falcon")
                .setSpeed(new SecureRandom().nextInt(60))
                .setWhithWings(true)
                .build();
        System.out.println(falcon.getNameAnimal() + " with speed is " + falcon.getSpeed());

        AnimalWithBuilder snake = builder
                .setNameAnimal("Snake")
                .setSpeed(new SecureRandom().nextInt(50))
                .setWhithWings(false)
                .build();
        System.out.println(snake.getNameAnimal() + " with speed is " + snake.getSpeed());

//        AnimalWithBuilder dog = builder.build();
//        System.out.println(dog);

        new TestBuilder().maxSpeedAnimal(Arrays.asList(tiger, eagle, falcon, snake));


    }

    public void maxSpeedAnimal(List<AnimalWithBuilder> AnimalWithBuilderLList) {
        int maxSpeedAnimal = AnimalWithBuilderLList.get(0).getSpeed();
        String maxNameAnimal = AnimalWithBuilderLList.get(0).getNameAnimal();
        for (AnimalWithBuilder animal : AnimalWithBuilderLList) {
            if (animal.isWhithWings()) {
                System.out.println(animal.getNameAnimal() + "not run");
            } else if (animal.getSpeed() > maxSpeedAnimal) {
                maxSpeedAnimal = animal.getSpeed();
                maxNameAnimal = animal.getNameAnimal();
            }

        }
        System.out.println("Winner is " + maxNameAnimal + " with speed: " + maxSpeedAnimal);

    }
}
