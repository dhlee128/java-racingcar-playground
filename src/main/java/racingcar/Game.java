package racingcar;

import domain.Car;
import view.InputView;
import view.OutputView;

import java.util.*;

public class Game {

    InputView iView = new InputView();
    OutputView oView = new OutputView();

    Winner winner = new Winner();

    public void start() {

        oView.msgInputNames();
        List<Car> cars = iView.inputCarNames();

        oView.msgTryCnt();
        int tryCnt = iView.inputTryCnt();

        oView.msgResult();
        oView.nextLine();

        for(int i=0; i<tryCnt; i++) {
            process(cars);
        }

        List<String> winners = winner.judgeWinner(cars);
        oView.msgWinner(winners);

    }

    public void process(List<Car> cars) {

        for(Car car:cars) {
            car.calDistance();
            oView.processView(car);
        }
        oView.nextLine();
    }


}
