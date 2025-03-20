package ladderGame;

public class LadderRunner {
    public int run(Ladder ladder, PositiveNumber startNumber) {
        int currentNumber = startNumber.getNumber();
        int row = ladder.getHeight();

        while(row > 0) {
            if (currentNumber > 1 && ladder.hasLine(new Position(row, currentNumber - 1))) { // 왼쪽 선이 있는 경우
                row--;
                currentNumber--;
                continue;
            }

            if (currentNumber < ladder.getWidth() && ladder.hasLine(new Position(row, currentNumber))) { // 오른쪽 선이 있는 경우
                row--;
                currentNumber++;
                continue;
            }

            row--;
        }

        return currentNumber;
    }
}
