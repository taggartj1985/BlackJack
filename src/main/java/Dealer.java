import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Card> dealersCards;

    public Dealer(){
        this.deck = new Deck();
        this.dealersCards = new ArrayList<Card>();
    }

    public ArrayList<Card> getDealersHand() {
        return this.dealersCards;
    }

    public void addCardToDealer(Card card){
        this.dealersCards.add(card);
    }

    public int dealerTotal(){
        int total = 0;
        for(Card card : this.dealersCards){
            total += card.getValue();
        }
        return total;
    }


}
