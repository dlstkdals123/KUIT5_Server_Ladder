package ladderGame;

public class Main {
    public static void main(String[] args) {
        int person = 5, ladderHeight = 5;
        int startNumber = 2;
//        LadderGame ladderGame = new LadderGame(person, ladderHeight);
//
//        ladderGame.drawLine(new Position(5, 1, person, ladderHeight));
//        ladderGame.drawLine(new Position(4, 2, person, ladderHeight));
//        ladderGame.drawLine(new Position(3, 1, person, ladderHeight));
//        ladderGame.drawLine(new Position(2, 2, person, ladderHeight));
//        ladderGame.drawLine(new Position(1, 3, person, ladderHeight));
//
//        LadderRunner ladderRunner = new LadderRunner(ladderGame, true);
//
//        System.out.println(ladderRunner.run(new PositiveNumber(startNumber)));


        LadderGame randomLadderGame = LadderGameFactory.createRandomLadderGame(person, ladderHeight);
        LadderRunner randomLadderRunner = new LadderRunner(randomLadderGame, true);

        System.out.println(randomLadderRunner.run(new PositiveNumber(startNumber)));

    }
}
