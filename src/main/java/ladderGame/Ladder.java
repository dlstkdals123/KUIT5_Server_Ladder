package ladderGame;

public class Ladder {
    private final Person person;
    private final LadderHeight ladderHeight;
    private final boolean[][] positions;

    public Ladder(final int person, final int ladderHeight) {
        this.person = new Person(person);
        this.ladderHeight = new LadderHeight(ladderHeight);
        positions = new boolean[person + 1][ladderHeight + 1];
    }

    public boolean drawLine(final int row, final int column) {
        if (!validateRow(row) || !validateColumn(column))
            return false;

        if (positions[row][column]) {
            System.out.println("이미 해당 위치에 선이 존재합니다.");
            return false;
        }

        if ((column < person.getPerson() && positions[row][column + 1])
            || (column > 1 && positions[row][column - 1])) {
            System.out.println("인접한 선이 존재합니다.");
            return false;
        }

        positions[row][column] = true;
        return true;
    }

    public int run(int startNumber) {
        if (startNumber < 1 || startNumber > person.getPerson()) {
            System.out.println("시작 지점은 1 이상 " + person.getPerson() + " 이하만 가능합니다.");
            return -1;
        }

        int row = ladderHeight.getLadderHeight();

        while(row > 0) {
            if (positions[row][startNumber - 1]) {
                row--;
                startNumber--;
                continue;
            }

            if (positions[row][startNumber]) {
                row--;
                startNumber++;
                continue;
            }

            row--;
        }

        return startNumber;
    }

    private boolean validateRow(final int row) {
        if (row < 1 || row > ladderHeight.getLadderHeight()) {
            System.out.println("세로 줄의 번호는 1 이상 " + ladderHeight.getLadderHeight() + " 이하여야 합니다.");
            return false;
        }
        return true;
    }

    private boolean validateColumn(final int column) {
        if (column < 1 || column > person.getPerson()) {
            System.out.println("가로 줄의 번호는 1 이상 " + person.getPerson() + " 이하여야 합니다.");
            return false;
        }
        return true;
    }
}
