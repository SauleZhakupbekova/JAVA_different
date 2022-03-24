package L8_Interface_BlackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Deck implements IDeck{
    private ICards[] cards = new ICards[52];

    //Constructor empty. Add there 52 cards:
    public Deck() {
        cards[0] = new Cards("Two clubs", 2); // черви worms, пики peaks, бубны diamonds, туз ace, рыуарь knight
        cards[1] = new Cards("Two peak", 2);
        cards[2] = new Cards("Two diamonds", 2);
        cards[3] = new Cards("Two worms", 2);

        cards[4] = new Cards("Three clubs", 3);
        cards[5] = new Cards("Three peak", 3);
        cards[6] = new Cards("Three diamonds", 3);
        cards[7] = new Cards("Three worms", 3);

        cards[8] = new Cards("Four clubs", 4);
        cards[9] = new Cards("Four peak", 4);
        cards[10] = new Cards("Four diamonds", 4);
        cards[11] = new Cards("Four worms", 4);

        cards[12] = new Cards("Five clubs", 5);
        cards[13] = new Cards("Five peak", 5);
        cards[14] = new Cards("Five diamonds", 5);
        cards[15] = new Cards("Five worms", 5);

        cards[16] = new Cards("Six clubs", 6);
        cards[17] = new Cards("Six peak", 6);
        cards[18] = new Cards("Six diamonds", 6);
        cards[19] = new Cards("Six worms", 6);

        cards[20] = new Cards("Seven clubs", 7);
        cards[21] = new Cards("Seven peak", 7);
        cards[22] = new Cards("Seven diamonds", 7);
        cards[23] = new Cards("Seven worms", 7);

        cards[24] = new Cards("Eight clubs", 8);
        cards[25] = new Cards("Eight peak", 8);
        cards[26] = new Cards("Eight diamonds", 8);
        cards[27] = new Cards("Eight worms", 8);

        cards[28] = new Cards("Nine clubs", 9);
        cards[29] = new Cards("Nine peak", 9);
        cards[30] = new Cards("Nine diamonds", 9);
        cards[31] = new Cards("Nine worms", 9);

        cards[32] = new Cards("Ten clubs", 10);
        cards[33] = new Cards("Ten peak", 10);
        cards[34] = new Cards("Ten diamonds", 10);
        cards[35] = new Cards("Ten worms", 10);

        cards[36] = new Cards("Jack clubs", 10);
        cards[37] = new Cards("Jack peak", 10);
        cards[38] = new Cards("Jack diamonds", 10);
        cards[39] = new Cards("Jack worms", 10);

        cards[40] = new Cards("Dam clubs", 10);
        cards[41] = new Cards("Dam peak", 10);
        cards[42] = new Cards("Dam diamonds", 10);
        cards[43] = new Cards("Dam worms", 10);

        cards[44] = new Cards("King clubs", 10);
        cards[45] = new Cards("King peak", 10);
        cards[46] = new Cards("King diamonds", 10);
        cards[47] = new Cards("King worms", 10);

        cards[48] = new Cards("Ace clubs", 11);
        cards[49] = new Cards("Ace peak", 11);
        cards[50] = new Cards("Ace diamonds", 11);
        cards[51] = new Cards("Ace worms", 11);

    }

    @Override
    public ICards randomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 52);
        return cards[randomIndex];
    }
}
