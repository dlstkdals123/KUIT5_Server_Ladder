package ladderGame;

public class Main {
    public static void main(String[] args) {
        int person = 5, ladderHeight = 5;
        Ladder ladder = new Ladder(person, ladderHeight);

        ladder.drawLine(new Position(5, 1));
        ladder.drawLine(new Position(4, 2));
        ladder.drawLine(new Position(3, 1));
        ladder.drawLine(new Position(2, 2));
        ladder.drawLine(new Position(1, 3));

        for (int i = 1; i <= person; i++)
            System.out.println(ladder.run(i));
    }
}
