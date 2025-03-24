package ladderGame;

public class Main {
    public static void main(String[] args) {
        int person = 5, ladderHeight = 5;
        int startNumber = 1;
        LadderSize ladderSize = new LadderSize(person, ladderHeight);
        LadderGame ladderGame = new LadderGame(ladderSize);

        ladderGame.drawLine(new Position(5, 1));
        ladderGame.drawLine(new Position(4, 2));
        ladderGame.drawLine(new Position(3, 1));
        ladderGame.drawLine(new Position(2, 2));
        ladderGame.drawLine(new Position(1, 3));

        LadderRunner ladderRunner = new LadderRunner(ladderGame, true);

        System.out.println(ladderRunner.run(new PositiveNumber(2)));
    }
}
