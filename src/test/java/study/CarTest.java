package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import valid.Validator;

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
        assertEquals("자동차 이름은 필수이다.", exception1.getMessage());

        Throwable exception2 = assertThrows(RuntimeException.class, () -> {
            validator.validCarName(null);
        });
        assertEquals("자동차 이름은 필수이다.", exception2.getMessage());

        validator.validCarName("rice");
        validator.validCarName("pasta");

        Throwable exception3 = assertThrows(RuntimeException.class, () -> {
            validator.validCarName("burger");
        });
        assertEquals("자동차 이름은 5자를 초과할 수 없다.", exception3.getMessage());
    }

    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분 확인")
    void carNameSplitTest() {

        Throwable exception1 = assertThrows(RuntimeException.class, () -> {
            validator.validCarNameSplit("");
        });
        assertEquals("자동차 이름은 필수이다.", exception1.getMessage());

        Throwable exception2 = assertThrows(RuntimeException.class, () -> {
            validator.validCarNameSplit(null);
        });
        assertEquals("자동차 이름은 필수이다.", exception2.getMessage());

        String[] names = validator.validCarNameSplit(",rice,pasta");
        assertThat("").isEqualTo(names[0]);
        assertThat("rice").isEqualTo(names[1]);
        assertThat("pasta").isEqualTo(names[2]);

        String[] names2 = validator.validCarNameSplit("rice, ,pasta");
        assertThat("rice").isEqualTo(names2[0]);
        assertThat(" ").isEqualTo(names2[1]);
        assertThat("pasta").isEqualTo(names2[2]);

        String[] names3 = validator.validCarNameSplit("rice,pasta,,");
        assertThat("rice").isEqualTo(names3[0]);
        assertThat("pasta").isEqualTo(names3[1]);

        String[] names4 = validator.validCarNameSplit(" rice , pasta , like ");
        assertThat(" rice ").isEqualTo(names4[0]);
        assertThat(" pasta ").isEqualTo(names4[1]);
        assertThat(" like ").isEqualTo(names4[2]);

    }
}
