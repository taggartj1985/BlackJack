import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;
    private Deck deck;
    Dealer dealer;
    Card card;
    Card card2;

    @Before
    public void before(){
        dealer = new Dealer();
        game = new Game(dealer);
        player = new Player("John");
        deck = new Deck();
        deck.populateDeck();
        card = new Card(SuitType.HEARTS, RankType.THREE);
        card2 = new Card(SuitType.HEARTS, RankType.KING);
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
        assertEquals(2, dealer.getDealersHand().size());
    }


    @Test
    public void canPlayerWin(){
        player.addCard(card2);
        player.addCard(card2);
        dealer.addCardToDealer(card);
        dealer.addCardToDealer(card);
        assertEquals("Player Wins", game.checkForWinner(player));
    }

    @Test
    public void canPlayerDraw(){
        player.addCard(card2);
        player.addCard(card2);
        dealer.addCardToDealer(card2);
        dealer.addCardToDealer(card2);
        assertEquals("Draw", game.checkForWinner(player));
    }

    @Test
    public void canPlayerLose(){
        player.addCard(card);
        player.addCard(card);
        dealer.addCardToDealer(card2);
        dealer.addCardToDealer(card2);
        assertEquals("Player Loses", game.checkForWinner(player));
    }

}
