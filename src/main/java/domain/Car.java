package domain;

import utils.Constants;
import utils.Validator;

import java.util.Random;

public class Car {

    private String name;
    private int distance;

    Validator validator = new Validator();

    private Car(String name, int distance) {

        validator.validCarName(name);

        this.name = name;
        this.distance = distance;
    }

    public static Car nameDistanceCar(String name, int distance) {
        return new Car(name, distance);
    }

    public String getName() { return name; }

    public int getDistance() {
        return distance;
    }

    public void calDistance() {

        Random random = new Random();
        int num= random.nextInt(9)+1;

        if(num>= Constants.MOVING_NUM_STANDARD) this.distance++;

    }

    public boolean biggerThan(int distance) {
        return this.distance > distance;
    }

    public boolean isEqualDistance(int distance) {
        return this.distance == distance;
    }
}
