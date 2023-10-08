package view;

import domain.Car;
import utils.Validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    Validator validator = new Validator();

    public int inputTryCnt() {

        int cnt = 0;

        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            cnt = Integer.parseInt(br.readLine());

            validator.validCarMoving(cnt);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return cnt;
    }

    public List<Car> inputCarNames() {

        List<Car> cars = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();

            validator.validCarNameSplit(line);

            String[] names = line.split(",");

            for(int i=0; i< names.length; i++) {

                cars.add(Car.nameDistanceCar(names[i], 0));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return cars;
    }

}
