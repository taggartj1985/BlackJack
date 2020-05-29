import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void deckStartsCanBePopulated(){
        deck.populateDeck();
        assertEquals(52, deck.getCards().size());
        assertEquals(SuitType.HEARTS, deck.getCards().get(0).getSuit());
        assertEquals(RankType.ACE, deck.getCards().get(0).getRank());
        assertEquals(SuitType.CLUBS, deck.getCards().get(51).getSuit());
        assertEquals(RankType.KING, deck.getCards().get(51).getRank());
    }

    @Test
    public void deckStartsCantBePopulatedTwice(){
        deck.populateDeck();
        deck.populateDeck();
        assertEquals(52, deck.getCards().size());
        assertEquals(SuitType.HEARTS, deck.getCards().get(0).getSuit());
        assertEquals(RankType.ACE, deck.getCards().get(0).getRank());
        assertEquals(SuitType.CLUBS, deck.getCards().get(51).getSuit());
        assertEquals(RankType.KING, deck.getCards().get(51).getRank());
    }


    @Test
    public void deckDealACard(){
        deck.populateDeck();
        Card result = deck.dealCard();
        assertEquals(51, deck.getCards().size());
        assertEquals(SuitType.HEARTS, result.getSuit());
        assertEquals(RankType.ACE, result.getRank());
    }

}
