package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Game {
    public List<String> judgeWinner(Map<String, Integer> cars) {

        List<String> winners = new ArrayList<>();

        int maxValue = Collections.max(cars.values());

        for(Map.Entry<String, Integer> car : cars.entrySet()) {
            if(car.getValue()==maxValue) {

                winners.add(car.getKey());
            }
        }

        return winners;
    }
}
