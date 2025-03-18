package ladderGame;

public class Ladder {
    private final Person person;
    private final LadderHeight ladderHeight;


    public Ladder(final int person, final int ladderHeight) {
        this.person = new Person(person);
        this.ladderHeight = new LadderHeight(ladderHeight);
    }

    public boolean drawLine(Position position) {

    }

    public int run(int startNumber) {

        return 1;
    }

    private void validatePosition(Position position) {
        if (row < 1 || row > this.person) {
            System.out.println("세로 줄의 번호는 1 이상 " + this.person + " 이하여야 합니다.");
            return false;
        }

        if (column < 1 || column > ladderHeight) {
            System.out.println("가로 줄의 번호는 1 이상 " + this.ladderHeight + " 이하여야 합니다.");
            return false;
        }

        return true;
    }

    private boolean checkColumnLine(int row, int column, int position) {
        if (!checkRange(row, column)) // 올바르지 않은 범위
            return false;

        if (ladderArray[row][column] == position) { // 중복된 선 추가 시도
            System.out.println("해당 위치에는 이미 동일한 선이 놓여있습니다.");
            return false;
        }

        if ()

    }
}
