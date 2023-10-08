package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Constants;
import utils.Validator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovingTest {

    static final Validator validator = new Validator();

    @Test
    @DisplayName("자동차 전진 확인")
    void carMovingTest() {

        Throwable exception = assertThrows(RuntimeException.class, () -> {
            validator.validCarMoving(10);
        });
        assertEquals(Constants.VALID_CAR_MOVING_RANDOM_MESSAGE, exception.getMessage());

        assertThat(false).isEqualTo(validator.validCarMoving(0));

        assertThat(true).isEqualTo(validator.validCarMoving(4));

        assertThat(true).isEqualTo(validator.validCarMoving(9));

    }
}
