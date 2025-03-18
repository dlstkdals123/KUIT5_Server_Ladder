package ladderGame;

public class Person {
    private int person;

    public Person(int person) {
        validateNumber(person);
        this.person = person;
    }

    private void validateNumber(final int person) {
        if (person < 1)
            throw new IllegalArgumentException("사람의 수는 1 이상이어야 합니다.");

    }


}
