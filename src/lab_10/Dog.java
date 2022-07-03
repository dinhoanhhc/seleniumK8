package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {

    int MAX_SPEED_DOG = 60;
    int randomSpeed = new SecureRandom().nextInt(MAX_SPEED_DOG);
    String name = "Dog";

    @Override
    public String nameAnimal() {
        return name;
    }

    @Override
    public int speed() {
        return randomSpeed;
    }
}
