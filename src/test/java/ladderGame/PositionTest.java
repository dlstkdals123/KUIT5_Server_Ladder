package ladderGame;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PositionTest {

    @ParameterizedTest
    @CsvSource(value = {"-1, 1", "0, 1"})
    @DisplayName("가로는 1 이상이어야 한다. (Negative)")
    void testRowNegative(final int row, final int column) {
        // given
        String expectedErrorMessage = "가로는 1 이상이어야 합니다.";

        // when & then
        assertThatThrownBy(() -> new Position(row, column))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(expectedErrorMessage);

    }


    @ParameterizedTest
    @CsvSource(value = {"1, -1", "1, 0"})
    @DisplayName("가로는 1 이상이어야 한다. (Negative)")
    void testColumnNegative(final int row, final int column) {
        // given
        String expectedErrorMessage = "세로는 1 이상이어야 합니다.";

        // when & then
        assertThatThrownBy(() -> new Position(row, column))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(expectedErrorMessage);

    }
}