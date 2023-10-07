package view;

import domain.Car;
import valid.Validator;

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

            String[] names = validator.validCarNameSplit(line);

            for(int i=0; i< names.length; i++) {

                validator.validCarName(names[i]);
                cars.add(Car.nameDistanceCar(names[i], 0));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return cars;
    }

}
