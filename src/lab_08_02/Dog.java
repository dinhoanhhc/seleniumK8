package lab_08_02;

import java.security.SecureRandom;

public class Dog extends Animal {

    int MAX_SPEED_DOG = 60;
    int randomSpeed = new SecureRandom().nextInt(MAX_SPEED_DOG);
    String name = "Dog";

    @Override
    public int getSpeed() {
        return randomSpeed;
    }

    @Override
    public String getNameAnimal() {
        return name;
    }
}
