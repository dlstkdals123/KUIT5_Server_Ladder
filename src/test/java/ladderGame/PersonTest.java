package ladderGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    @DisplayName("사람의 수는 1이상이어야 한다. (Negative)")
    void testPersonNegative(final int person) {
        // given
        String expectedErrorMessage = "사람의 수는 1 이상이어야 합니다.";

        // when & then
        assertThatThrownBy(() -> new Person(person))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(expectedErrorMessage);
    }
}