package L8_Interface_BlackJack;

import java.util.ArrayList;

public class BlackJack implements IBlackJacks {

    private Deck deck = new Deck();
    private ArrayList<IPlayers> players = new ArrayList<>();

    @Override
    public void newPlayer(IPlayers player) {
        players.add(player);

    }

    @Override
    public void dealTwoCards() {
        for (IPlayers player : players) {
            player.takeCard(deck.randomCard());
            player.takeCard(deck.randomCard());
            player.takeCard(deck.randomCard());
        }
    }

    @Override
    public void dealStock() {
        for (IPlayers player : players) {
            while (player.newCards()) {
                player.takeCard(deck.randomCard());
            }
        }

    }

    @Override
    public void printWinner() {
        // 19  19  23  21
        // 19  19  23  10
        // 29  29  23  23
        // 19  18  12  13
        // 29  29  13  23

        //closed all whose cards' score is more than 21
        for (IPlayers player : players) {
            if (player.score() > 21) {
                player.setCanWin(false);
            }
        }


        // if no players continue to be in game then print cards of dealer
        if (this.countWinners() == 0) {
            System.out.println("----Dealer wins!----");
            for (IPlayers player : players) {
                if (player instanceof Dealer) {
                    player.openCards();
                }
            }
        }


        // 19  18  12  13
        int scoreOfWinner = -1; //-1 means it is not set then 19 then 18 then 12 then 13
        for (IPlayers player : players) {
            if (player.isCanWin()) {
                if (player.score() > scoreOfWinner) {
                    scoreOfWinner = player.score();
                }
            }
        }
        for (IPlayers player : players) {
            if (player.score() == scoreOfWinner) {
                System.out.println("----Winner: ----");
                player.openCards();
            }
        }

    }
        public int countWinners () {
            int count = 0;
            for (IPlayers player : players) {
                if (player.isCanWin()) {
                    count++;
                }
            }


            return count;
        }
    }


