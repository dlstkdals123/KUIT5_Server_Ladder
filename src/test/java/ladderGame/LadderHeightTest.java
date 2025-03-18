package ladderGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class LadderHeightTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    @DisplayName("사다리의 높이는 1이상이어야 한다. (Negative)")
    void testLadderHeightNegative(final int ladderHeight) {
        // given
        String expectedErrorMessage = "사다리의 높이는 1 이상이어야 합니다.";

        // when & then
        assertThatThrownBy(() -> new LadderHeight(ladderHeight))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(expectedErrorMessage);

    }
}