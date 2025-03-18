package ladderGame;

public class Position {
    private int rowIdx, columnIdx, state = 0;

    public Position(final int rowIdx, final int columnIdx) {
        this.rowIdx = rowIdx;
        this.columnIdx = columnIdx;
    }

    public int getRowIdx() {
        return rowIdx;
    }

    public int getColumnIdx() {
        return columnIdx;
    }

    public int getState() {
        return state;
    }
}
