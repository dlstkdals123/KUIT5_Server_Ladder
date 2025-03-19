package ladderGame;

public class LadderHeight {
    private final int ladderHeight;

    public LadderHeight(int ladderHeight) {
        checkPositive(ladderHeight);
        this.ladderHeight = ladderHeight;
    }

    private void checkPositive(final int ladderHeight) {
        if (ladderHeight < 1)
            throw new IllegalArgumentException("사다리의 높이는 1 이상이어야 합니다.");
    }

    public int getLadderHeight() {
        return ladderHeight;
    }
}
