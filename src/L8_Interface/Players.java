package L8_Interface;

public class Players implements IPlayers{
    private ICards[] hand = new ICards[20]; //list (place) where Player's cards are kept

    @Override
    public void takeCard(ICards card) {
        for(int i = 0; i < hand.length; i++){
            if(hand[i] == null){
                hand[i] = card;
                break; // one the same card will not fill in all empty cells
            }

        }

    }

    @Override
    public boolean newCards() {
        return false;
    }

    @Override
    public void openCards() {
        for(int i = 0; i < hand.length; i++){
            if(hand[i] != null){
                hand[i].open();
            }

        }

    }
}
