package classes.cards;

public class Cards {

    public static void main(String[] args) {
        Card card1 = new Card("Acee", "Spades");
        System.out.println(
            (card1.checkCard() ? card1.rank + " of " + card1.suit : "Invalid rank and/or suit")
        );

    }
}

class Card{

    String[] ranks = {"Ace", "King", "Queen", "Jack",
        "10", "9", "8", "7", "6", "5", "3", "2"};

    String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};

    String rank;
    String suit;

    public Card(String rank, String suit) {
        for (String r : ranks) {
            if (r.equalsIgnoreCase(rank)) {
                for (String s : suits) {
                    if (s.equalsIgnoreCase(suit)) {
                        this.rank = rank;
                        this.suit = suit;
                        break;
                    }
                }
            }
        }
    }

    public Boolean checkCard() {
        if (this.rank == null | this.suit == null) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}