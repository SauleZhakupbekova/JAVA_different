package L8_Interface_BlackJack;

public class Dealer extends Players implements IDealer{

    @Override
    public boolean newCards() {
        if(this.score() < 18){
            return true;
        }
        return false;
    }
}
