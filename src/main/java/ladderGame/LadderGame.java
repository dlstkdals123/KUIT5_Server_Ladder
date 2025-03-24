package ladderGame;

public class LadderGame {
    LadderSize ladderSize;
    private boolean[][] positions;

    public LadderGame(LadderSize ladderSize) {
        this.ladderSize = ladderSize;
        positions = new boolean[ladderSize.getRow() + 1][ladderSize.getColumn() + 1];
    }

    public void drawLine(Position position) {
        final int row = position.getRow(), column = position.getColumn();
        validateAll(row, column);

        positions[row][column] = true;
    }

    public int getHeight() {
        return ladderSize.getRow();
    }

    public int getWidth() {
        return ladderSize.getColumn();
    }

    public boolean hasLine(Position position) {
        final int row = position.getRow(), column = position.getColumn();
        return positions[row][column];
    }

    private void validateAll(int row, int column) {
        validateRow(row);
        validateColumn(column);
        validatePresentLine(row, column);
        validateAdjLine(row, column);
    }

    private void validateRow(int row) {
        if (row > this.getHeight())
            throw new IllegalArgumentException(ExceptionCode.ROW_OUT_OF_RANGE.getMessage());
    }

    private void validateColumn(int column) {
        if (column > this.getWidth())
            throw new IllegalArgumentException(ExceptionCode.COLUMN_OUT_OF_RANGE.getMessage());
    }

    private void validatePresentLine(int row, int column) {
        if (positions[row][column])
            throw new IllegalArgumentException(ExceptionCode.PRESENT_LINE.getMessage());
    }

    private void validateAdjLine(int row, int column) {
        if ((column < getWidth() && positions[row][column + 1]) // 오른쪽에 인접한 선이 있는 경우
                || (column > 1 && positions[row][column - 1])) { // 왼쪽에 인접한 선이 있는 경우
            throw new IllegalArgumentException(ExceptionCode.ADJACENT_LINE.getMessage());
        }
    }
}