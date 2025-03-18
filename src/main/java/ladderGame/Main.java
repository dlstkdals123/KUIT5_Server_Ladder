package ladderGame;

public class Main {
    public static void main(String[] args) {
        int person = 5, ladderHeight = 5;
        Ladder ladder = new Ladder(person, ladderHeight);

        ladder.drawLine(5, 1);
        ladder.drawLine(5, 4);
        ladder.drawLine(4, 2);
        ladder.drawLine(3, 1);
        ladder.drawLine(2, 2);
        ladder.drawLine(1, 3);

        for (int i = 1; i <= person; i++)
            System.out.println(ladder.run(i));
    }
}
