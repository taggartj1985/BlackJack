import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class PlayerTest {
        Player player;
        String name;
        Card card;
        Card card2;


        @Before
        public void before(){
            name = "John";
            player = new Player(name);
            card = new Card(SuitType.HEARTS, RankType.ACE);
            card2 = new Card(SuitType.HEARTS, RankType.KING);
        }

        @Test
        public void hasName(){
            assertEquals("John", player.getName());
        }

        @Test
        public void hasEmptyHand(){
            assertEquals(0, player.getHand().size());
        }

        @Test
        public void canTakeCard(){
            player.addCard(card);
            assertEquals(1, player.getHand().size());
        }

        @Test
        public void canClearHand(){
            player.addCard(card);
            player.clearHand();
            assertEquals(0, player.getHand().size());
        }

        @Test
        public void canCheckCardTotal(){
            player.addCard(card);
            player.addCard(card2);
            assertEquals(21, player.playerTotal());
        }
    }
