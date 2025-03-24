package ladderGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LadderRunnerTest {

    @ParameterizedTest
    @CsvSource(value = {"1, 2", "2, 4", "3, 1", "4, 3", "5, 5"})
    @DisplayName("Positive: 사다리의 결과가 예상과 같아야 한다.")
    void shouldCreateLadderSuccessfullyWhenPositiveNumbers(int startNumber, int endNumber) {
        // given
        int person = 5, ladderHeight = 5;
        LadderGame ladderGame = new LadderGame(person, ladderHeight);

        ladderGame.drawLine(new Position(5, 1));
        ladderGame.drawLine(new Position(4, 2));
        ladderGame.drawLine(new Position(3, 1));
        ladderGame.drawLine(new Position(2, 2));
        ladderGame.drawLine(new Position(1, 3));

        LadderRunner ladderRunner = new LadderRunner(ladderGame, false);

        // then
        assertThat(ladderRunner.run(new PositiveNumber(startNumber))).isEqualTo(endNumber);
    }
}