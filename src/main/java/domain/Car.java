package domain;

import java.util.Random;

public class Car {

    private String name;
    private int distance;

    private Car(String name, int distance) {
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

        if(num>=4) this.distance++;

    }

    public boolean biggerThan(int distance) {
        return this.distance > distance;
    }

    public boolean isEqualDistance(int distance) {
        return this.distance == distance;
    }
}
