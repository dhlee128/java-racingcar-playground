package study;

import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Winner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {

    @Test
    @DisplayName("우승자 확인")
    void carMovingTest() {

        Winner winner = new Winner();

        List<Car> cars = new ArrayList<>();

        cars.add(Car.nameDistanceCar("rice",4));
        cars.add(Car.nameDistanceCar("cake",10));
        cars.add(Car.nameDistanceCar("pizza",10));
        cars.add(Car.nameDistanceCar("pasta",2));

        List<String> winners = winner.judgeWinner(cars);
        assertThat(2).isEqualTo(winners.size());
    }
}
