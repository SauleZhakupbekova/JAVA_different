package L8_Interface;

import java.util.Objects;

public class Cards implements ICards{
    // variables
    private String cardName;
    private int score;

    // constructors empty
    public Cards() {
    }
    // constructors with parameters
    public Cards(String cardName, int score) {
        this.cardName = cardName;
        this.score = score;
    }

    //Getters & Setters

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Methods
    @Override
    public void open() {
        System.out.println(this.cardName);

    }

    @Override
    public int getScore() {
        return this.score;
    }

    // Equal, HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cards cards = (Cards) o;

        return score == cards.score && Objects.equals(cardName, cards.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardName, score);
    }

    // To String

    @Override
    public String toString() {
        return "Cards{" +
                "cardName='" + cardName + '\'' +
                ", score=" + score +
                '}';
    }
}
