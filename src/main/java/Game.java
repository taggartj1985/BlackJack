import java.util.ArrayList;

public class Game{


    private ArrayList<Player> players;
    Dealer dealer;

    public Game(Dealer dealer) {
        this.players = new ArrayList<Player>();
        this.dealer = dealer;
    }


    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void setUp(Deck deck) {
        for (Player player : this.players) {
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
        }
    }

    public void setUpForDealer(Deck deck){
        dealer.addCardToDealer(deck.dealCard());
        dealer.addCardToDealer(deck.dealCard());
    }

//    public void

}