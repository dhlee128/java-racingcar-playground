package view;

import domain.Car;
import utils.Constants;

import java.util.List;

public class OutputView {

    public void msgInputNames() {
        System.out.println(Constants.INPUT_CAR_NAMES);
    }

    public void msgTryCnt() {
        System.out.println(Constants.INPUT_GAME_TRY_COUNT);
    }

    public void msgResult() { System.out.println(Constants.INPUT_GAME_RESULT); }

    public void msgWinner(List<String> names) {
        System.out.println(names.toString() + Constants.INPUT_GAME_WINNER);
    }

    public void nextLine() { System.out.println(); }

    public void processView(Car car) {

        String carName = car.getName();
        int distance = car.getDistance();

        String disStr = "";

        for(int i=0; i<distance; i++) {
            disStr += "-";
        }

        System.out.println(carName + " : " + disStr);
    }
}
