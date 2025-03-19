package ladderGame;

public class Position {
    private int row, column;

    public Position(final int row, final int column) {
        checkPositive(row, column);
        this.row = row;
        this.column = column;
    }

    private void checkPositive(final int row, final int column) {
        if (row < 1)
            throw new IllegalArgumentException("가로는 1 이상이어야 합니다.");

        if (column < 1)
            throw new IllegalArgumentException("세로는 1 이상이어야 합니다.");
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
