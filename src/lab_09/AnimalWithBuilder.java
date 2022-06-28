package lab_09;

public class AnimalWithBuilder {

    private String nameAnimal;
    private boolean whithWings;
    //    private int speed =  new SecureRandom().nextInt(100);;
    private int speed = 0;

    protected AnimalWithBuilder(Builder builder) {
        this.nameAnimal = builder.nameAnimal;
        this.whithWings = builder.whithWings;
        this.speed = builder.speed;

    }
    //read only

    public String getNameAnimal() {
        return nameAnimal;
    }

    public boolean isWhithWings() {
        return whithWings;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", whithWings=" + whithWings +
                ", speed=" + speed +
                '}';
    }

    //Inner class

    public static class Builder {
        private String nameAnimal;
        private boolean whithWings;
        private int speed;

        //Write only

        public Builder setNameAnimal(String nameAnimal) {
            this.nameAnimal = nameAnimal;
            return this;
        }

        public Builder setWhithWings(boolean whithWings) {
            this.whithWings = whithWings;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }


    }


}
