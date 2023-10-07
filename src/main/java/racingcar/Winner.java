package racingcar;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    public List<String> judgeWinner(List<Car> cars) {

        List<String> winners = new ArrayList<>();

        int maxDistance = 0;

        for(Car car:cars) {
            maxDistance = addWinnerName(maxDistance, winners, car);
        }

        return winners;
    }

    public int addWinnerName(int maxDistance, List<String> winners, Car car) {

        if(car.biggerThan(maxDistance)) {
            winners.clear();
            maxDistance = car.getDistance();
        }
        if(car.isEqualDistance(maxDistance)) {
            winners.add(car.getName());
        }

        return maxDistance;
    }
}
