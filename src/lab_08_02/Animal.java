package lab_08_02;

public class Animal {

    String nameAnimal;
    int speed;

    public Animal() {

    }

    public Animal(String nameAnimal, int speed) {
        this.nameAnimal = nameAnimal;
        this.speed = speed;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
