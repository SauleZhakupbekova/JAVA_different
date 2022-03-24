package L8_Interface_BlackJack;

public interface IPlayers {

    void takeCard(ICards card);

    boolean newCards();

    void openCards();

    int score();

    boolean isCanWin();

    void setCanWin(boolean canWin);
}
