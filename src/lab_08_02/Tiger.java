package lab_08_02;

import java.security.SecureRandom;

public class Tiger extends Animal {

    int MAX_SPEED_TIGER = 100;
    int randomSpeed = new SecureRandom().nextInt(MAX_SPEED_TIGER);
    String name = "Tiger";

    @Override
    public int getSpeed() {
        return randomSpeed;
    }

    public String getNameAnimal() {
        return name;
    }
}
