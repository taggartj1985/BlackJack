import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;
    private Deck deck;
    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer();
        game = new Game(dealer);
        player = new Player("John");
        deck = new Deck();
        deck.populateDeck();
    }

    @Test
    public void hasNoPlayers(){
        assertEquals(0, game.getPlayers().size());
    }

    @Test
    public void canAddPlayers(){
        game.addPlayer(player);
        assertEquals(1, game.getPlayers().size());
    }

    @Test
    public void canDealCards(){
        game.addPlayer(player);
        game.setUp(deck);
        assertEquals(2, game.getPlayers().get(0).getHand().size());
    }

    @Test
    public void canDealCardsToDealer(){
        game.setUpForDealer(deck);
        assertEquals(2, dealer.getDealersHand().size());
    }
}
