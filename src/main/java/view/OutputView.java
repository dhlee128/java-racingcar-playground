package view;

import domain.Car;

import java.util.List;

public class OutputView {

    public void msgInputNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void msgTryCnt() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void msgResult() { System.out.println("실행 결과"); }

    public void msgWinner(List<String> names) {
        System.out.println(names.toString() + "가 최종 우승했습니다.");
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
