package ladderGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    private static Ladder ladder;

    @BeforeEach
    void setUp() {
        int person = 5;
        int ladderHeight = 5;
        ladder = new Ladder(person, ladderHeight);
    }


    @ParameterizedTest
    @CsvSource(value = {"1, 1", "1, 5", "5, 1", "5, 5"})
    @DisplayName("입력한 선의 인덱스는 (1, 1) 이상 (사다리높이, 사람수) 이하여야 합니다.")
    void testRowAndColumn(final int row, final int column) {
        // when
        boolean result = ladder.drawLine(row, column);

        // then
        assertTrue(result);
    }



    @ParameterizedTest
    @CsvSource(value = {"0, 1", "6, 1", "1, 0", "1, 6", "-1, -1"})
    @DisplayName("입력한 선이 중복되면 저장되지 않습니다.")
    void testExistingLine(final int row, final int column) {
        // when
        boolean result = ladder.drawLine(row, column);

        // then
        assertFalse(result);
    }



    @ParameterizedTest
    @CsvSource(value = {"1, 2", "5, 4"})
    @DisplayName("입력한 선과 인접한 선이 있다면 저장되지 않습니다.")
    void testAdjLine(final int row, final int column) {
        // given
        ladder.drawLine(1, 1);
        ladder.drawLine(5, 5);

        // when
        boolean result = ladder.drawLine(row, column);

        // then
        assertFalse(result);
    }


    @ParameterizedTest
    @CsvSource(value = {"1, 5"})
    @DisplayName("시작 번호는 1 이상 사람 수 이하여야 합니다.")
    void testStartNumberInRange(final int startNumber) {
        // when
        int result = ladder.run(startNumber);

        // then
        assertTrue(result >= 1 && result <= 5);
    }


    @ParameterizedTest
    @CsvSource(value = {"0, 6"})
    @DisplayName("시작 번호는 1 이상 사람 수 이하여야 합니다.")
    void testStartNumberOutOfRange(final int startNumber) {
        // when
        int result = ladder.run(startNumber);

        // then
        assertEquals(-1, result);
    }




}