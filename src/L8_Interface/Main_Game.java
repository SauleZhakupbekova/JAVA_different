package L8_Interface;

public class Main_Game {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();

        Dealer dealer = new Dealer();
        Players player1 = new Players();
        Players player2 = new Players();
        blackJack.newPlayer(dealer);
        blackJack.newPlayer(player1);
        blackJack.newPlayer(player2);

        blackJack.dealTwoCards();
        blackJack.dealStock();
        blackJack.printWinner();

        Deck deck = new Deck();

        player1.takeCard(deck.randomCard());
        player1.takeCard(deck.randomCard());
        player1.takeCard(deck.randomCard());

        player1.openCards();
    }
}
