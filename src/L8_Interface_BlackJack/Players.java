package L8_Interface_BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Players implements IPlayers{
    private ArrayList<ICards> hand = new ArrayList<>(); //list (place) where Player's cards are kept
    private boolean canWin = true;

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public void takeCard(ICards card) {
        hand.add(card);
    }

    @Override
    public boolean newCards() {
        System.out.println("Your Cards: ");
        this.openCards();
        System.out.println("Need more cards (yes/no)");

        Scanner scanner = new Scanner(System.in);
        if(scanner.next().equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }

    @Override
    public void openCards() {
        for(ICards cards:hand){
            cards.open();
            }

        }

    @Override
    public int score() {
        int sum = 0;
        for(ICards card:hand){
            sum += card.getScore();
        }
        return sum;
    }

}

