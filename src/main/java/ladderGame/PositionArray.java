package ladderGame;

import java.util.ArrayList;

public class PositionArray {
    ArrayList<Position> columnLine;
    private final Person person;
    private final LadderHeight ladderHeight;

    public PositionArray(final int person, final int ladderHeight) {
        this.person = new Person(person);
        this.ladderHeight = new LadderHeight(ladderHeight);
        columnLine = new ArrayList<>();
    }

}
