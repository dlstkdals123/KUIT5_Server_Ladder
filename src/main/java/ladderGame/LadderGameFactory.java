package ladderGame;

import java.util.ArrayList;
import java.util.Random;

public class LadderGameFactory {
    public static LadderGame createRandomLadderGame(int person, int height) {
        validateSolo(person);
        LadderGame ladderGame = new LadderGame(person, height);
        int numberOfLadderLine = (int) (person * height * 0.3);
        Random random = new Random();

        ArrayList<Position> positions = getPositions(person, height);

        while(true) {
            if (numberOfLadderLine == 0)
                break;

            int randomIndex = random.nextInt(numberOfLadderLine);
            Position position = positions.get(randomIndex);
            ladderGame.drawLine(position);
            numberOfLadderLine--;
            positions.remove(randomIndex);

            ArrayList<Position> possiblePositions = new ArrayList<Position>();

            for(int index = 0; index < positions.size(); index++) {
                if (!ladderGame.isAdjLine(positions.get(index)))
                    possiblePositions.add(positions.get(index));
            }

            positions = possiblePositions;
        }

        return ladderGame;
    }

    private static void validateSolo(int person) {
        if (person == 1) {
            throw new IllegalArgumentException(ExceptionCode.NO_SOLO_RANDOM_LADDER.getMessage());
        }
    }

    private static ArrayList<Position> getPositions(int person, int height) {
        ArrayList<Position> positions = new ArrayList<Position>();

        for(int possibleRow = 1; possibleRow < height; possibleRow++) {
            for(int possibleColumn = 1; possibleColumn < person; possibleColumn++) {
                Position possiblePosition = new Position(possibleRow, possibleColumn, height, person);
                positions.add(possiblePosition);
            }
        }

        return positions;
    }
}
