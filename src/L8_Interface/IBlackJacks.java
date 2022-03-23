package L8_Interface;

public interface IBlackJacks {

    void newPlayer(IPlayers player);

    void dealTwoCards();

    void dealStock(); //deal remained cards

    void printWinner();

}
