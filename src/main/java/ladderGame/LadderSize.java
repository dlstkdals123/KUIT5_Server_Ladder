package ladderGame;

public class LadderSize {
    private PositiveNumber person;
    private PositiveNumber height;

    public LadderSize(int height, int person) {
        this.height = new PositiveNumber(height);
        this.person = new PositiveNumber(person);
    }

    public int getColumn() {
        return person.getNumber();
    }

    public int getRow() {
        return height.getNumber();
    }
}
