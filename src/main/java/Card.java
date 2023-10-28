import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};

enum Position {DECK, HOLE, PLAYER}

public class Card {
    private int rank;
    private Suit suit;
    private Position position;
    private int playerNum;
    // private List<String> ranks;
//    private List<>

    public Card(Integer rank, Suit suit, Position position, int playerNum) {
        this.rank = rank;
        this.suit = suit;
        this.position = position;
        this.playerNum = playerNum;
//        this.ranks = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10",
//                "Jack", "Queen", "King", "Ace"));
    }


    public Suit getSuit() {
        return suit;
    }

//    public List<String> getRanks() {
//        return ranks;
//    }

    public String formatRank(Integer rank) {
        String rankFormatted = "";
        if (rank == 11) {
            rankFormatted = "Jack";
        } else if (rank == 12) {
            rankFormatted = "Queen";
        } else if (rank == 13) {
            rankFormatted = "King";
        } else if (rank == 14) {
            rankFormatted = "Ace";
        } else {
            rankFormatted = String.valueOf(rank);
        }
        return rankFormatted;
    }

    public String getRank() {
        return formatRank(rank);
    }

    public void setRank(Integer rank) {
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

    @Override
    public String toString() {

        return "Card{" +
                "rank=" +// rank +
                formatRank(rank) +
                ", suit=" + suit +
                ", position=" + position +
                ", playerNum=" + playerNum +
                //  ", ranks=" + ranks +
                '}';
    }
}
