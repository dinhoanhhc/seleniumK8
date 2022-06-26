package lab_08_02;

import java.security.SecureRandom;

public class Horse extends Animal {
    int MAX_SPEED_HORSE = 75;
    int randomSpeed = new SecureRandom().nextInt(MAX_SPEED_HORSE);
    String name = "Horse";

    @Override
    public int getSpeed() {
        return randomSpeed;
    }

    @Override
    public String getNameAnimal() {
        return name;
    }
}
