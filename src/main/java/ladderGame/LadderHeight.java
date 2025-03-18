package ladderGame;

public class LadderHeight {
    private int ladderHeight;

    public LadderHeight(int ladderHeight) {
        validateHeight(ladderHeight);
        this.ladderHeight = ladderHeight;
    }

    private void validateHeight(final int ladderHeight) {
        if (ladderHeight < 1)
            throw new IllegalArgumentException("사다리의 높이는 1 이상이어야 합니다.");

    }

}
