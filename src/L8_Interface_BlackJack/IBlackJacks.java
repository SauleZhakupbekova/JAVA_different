package L8_Interface_BlackJack;

public interface IBlackJacks {

    void newPlayer(IPlayers player);

    void dealTwoCards();

    void dealStock(); //deal remained cards

    void printWinner();

}
