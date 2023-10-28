import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};
enum Position {DECK, HOLE, PLAYER}
public class Card {
    private String rank;
    private Suit suit;
    private Position position;
    private int playerNum;
    private List<String> ranks;
//    private List<>

    public Card(String rank, Suit suit, Position position, int playerNum) {
        this.rank = rank;
        this.suit = suit;
        this.position = position;
        this.playerNum = playerNum;
        this.ranks = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                "Jack", "Queen", "King", "Ace"));
    }


    public Suit getSuit() {
        return suit;
    }

    public List<String> getRanks() {
        return ranks;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

}
