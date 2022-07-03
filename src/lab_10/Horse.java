package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {
    int MAX_SPEED_HORSE = 75;
    int randomSpeed = new SecureRandom().nextInt(MAX_SPEED_HORSE);
    String name = "Horse";

    @Override
    public String nameAnimal() {
        return name;
    }

    @Override
    public int speed() {
        return randomSpeed;
    }
}
