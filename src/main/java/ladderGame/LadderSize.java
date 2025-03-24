package ladderGame;

public class LadderSize {
    private PositiveNumber person;
    private PositiveNumber ladderHeight;

    public LadderSize(int ladderHeight, int person) {
        this.ladderHeight = new PositiveNumber(ladderHeight);
        this.person = new PositiveNumber(person);
    }

    public int getColumn() {
        return person.getNumber();
    }

    public int getRow() {
        return ladderHeight.getNumber();
    }
}
