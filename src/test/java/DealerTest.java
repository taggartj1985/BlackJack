import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer;
    Card card;
    Card card2;


    @Before
    public void before(){
        dealer = new Dealer();
        card = new Card(SuitType.HEARTS, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void canTakeCard(){
        dealer.addCardToDealer(card);
        assertEquals(1, dealer.getDealersHand().size());
    }

    @Test
    public void canCheckCardTotal(){
        dealer.addCardToDealer(card);
        dealer.addCardToDealer(card2);
        assertEquals(21, dealer.dealerTotal());
    }
}
