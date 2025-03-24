package ladderGame;

public class LadderRunner {
    private LadderGame ladderGame;
    private boolean debug;

    public LadderRunner(LadderGame ladderGame, boolean debug) {
        this.ladderGame = ladderGame;
        this.debug = debug;
    }

    public int run(PositiveNumber startNumber) {
        Position position = new Position(ladderGame.getHeight() + 1, startNumber.getNumber());

        while(canMoveDown(position)) {
            position = move(position);
        }

        return position.getColumn();
    }

    private Position move(Position currentPosition) {

        Position newPosition = moveDown(currentPosition);

        if (canMoveRight(newPosition)) { // move right
            return moveRight(newPosition);
        }

        if (canMoveLeft(newPosition)) { // move left
            return moveLeft(newPosition);
        }

        return newPosition;

    }

    private boolean canMoveDown(Position position) {
        return position.getRow() > 1;
    }

    private boolean canMoveLeft(Position position) {
        return (position.getColumn() > 1 && ladderGame.hasLine(new Position(position.getRow(), position.getColumn() - 1)));
    }

    private boolean canMoveRight(Position position) {
        return (position.getColumn() < ladderGame.getWidth() && ladderGame.hasLine(position));
    }

    private Position moveLeft(Position currentPosition) {
        Position newPosition = new Position(currentPosition.getRow(), currentPosition.getColumn() - 1);
        if (debug)
            LadderPrinter.printLadder(ladderGame, newPosition);
        return newPosition;
    }

    private Position moveRight(Position currentPosition) {
        Position newPosition = new Position(currentPosition.getRow(), currentPosition.getColumn() + 1);
        if (debug)
            LadderPrinter.printLadder(ladderGame, newPosition);
        return newPosition;
    }

    private Position moveDown(Position currentPosition) {
        Position newPosition = new Position(currentPosition.getRow() - 1, currentPosition.getColumn());
        if (debug)
            LadderPrinter.printLadder(ladderGame, newPosition);
        return newPosition;
    }


}
