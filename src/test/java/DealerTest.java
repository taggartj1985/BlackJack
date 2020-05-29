import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer;
    Card card;


    @Before
    public void before(){
        dealer = new Dealer();
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void canTakeCard(){
        dealer.addCardToDealer(card);
        assertEquals(1, dealer.getDealersHand().size());
    }
}
