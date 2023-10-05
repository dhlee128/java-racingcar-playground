package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {

    @Test
    @DisplayName("우승자 확인")
    void carMovingTest() {

        Game game = new Game();

        Map<String, Integer> cars = new HashMap<>();

        cars.put("rice",4);
        cars.put("cake",10);
        cars.put("pizza",10);
        cars.put("pasta",2);

        List<String> winners = game.judgeWinner(cars);
        assertThat(2).isEqualTo(winners.size());
    }
}
