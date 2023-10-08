package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Constants;
import utils.Validator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    static final Validator validator = new Validator();

    @Test
    @DisplayName("자동차 이름 5글자 확인")
    void carNameTest() {

        Throwable exception1 = assertThrows(RuntimeException.class, () -> {
            validator.validCarName("");
        });
        assertEquals(Constants.VALID_CAR_NAME_MESSAGE, exception1.getMessage());

        Throwable exception2 = assertThrows(RuntimeException.class, () -> {
            validator.validCarName(null);
        });
        assertEquals(Constants.VALID_CAR_NAME_MESSAGE, exception2.getMessage());

        validator.validCarName("rice");
        validator.validCarName("pasta");

        Throwable exception3 = assertThrows(RuntimeException.class, () -> {
            validator.validCarName("burger");
        });
        assertEquals(Constants.VALID_CAR_NAME_5_MESSAGE, exception3.getMessage());
    }

    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분 확인")
    void carNameSplitTest() {

        Throwable exception1 = assertThrows(RuntimeException.class, () -> {
            validator.validCarNameSplit("");
        });
        assertEquals(Constants.VALID_CAR_NAME_MESSAGE, exception1.getMessage());

        Throwable exception2 = assertThrows(RuntimeException.class, () -> {
            validator.validCarNameSplit(null);
        });
        assertEquals(Constants.VALID_CAR_NAME_MESSAGE, exception2.getMessage());

        Throwable exception3 = assertThrows(RuntimeException.class, () -> {
            validator.validCarNameSplit("pasta");
        });
        assertEquals(Constants.VALID_CAR_NAME_SPLIT_MESSAGE, exception3.getMessage());

        validator.validCarNameSplit("pasta,hamburger");

    }
}
