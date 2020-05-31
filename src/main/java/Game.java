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
        deck.shuffleDeck();
        for (Player player : this.players) {
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
        }
        dealer.addCardToDealer(deck.dealCard());
        dealer.addCardToDealer(deck.dealCard());
    }

    public void setUpForDealer(Deck deck){
        dealer.addCardToDealer(deck.dealCard());
        dealer.addCardToDealer(deck.dealCard());
    }

    public String checkForWinner(Player player){
        String result = "test";
        if((player.playerTotal() < dealer.dealerTotal()) &&
                dealer.dealerTotal() <= 21 )
            result = "Player Loses";
        else if ((player.playerTotal() == dealer.dealerTotal()) &&
                dealer.dealerTotal() <= 21 )
            result = "Draw";
        else
            result = "Player Wins";

        return result;

    }

    public boolean playerBust(Player player){
        boolean result = false;
        if((player.playerTotal() > 21))
            result = true;

            return result;
    }

    public boolean dealerBust(){
        boolean result = false;
        if((dealer.dealerTotal() > 21))
            result = true;

        return result;
    }

}