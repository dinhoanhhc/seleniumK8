package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {

    int MAX_SPEED_TIGER = 100;
    int randomSpeed = new SecureRandom().nextInt(MAX_SPEED_TIGER);
    String name = "Tiger";

    @Override
    public String nameAnimal() {
        return name;
    }

    @Override
    public int speed() {
        return randomSpeed;
    }
}
