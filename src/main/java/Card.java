enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};

//enum Location {DECK, HOLE, PLAYER}

public class Card {
    private int rank;
    private Suit suit;
//    private String location;
//    private int playersNum;
    // private List<String> ranks;
//    private List<>

    public Card(Integer rank, Suit suit, String location, int playersNum) {
        this.rank = rank;
        this.suit = suit;
//        this.location = location;
//        this.playersNum = playersNum;
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

//    public String getPosition() {
//        return location;
//    }

//    public void setPosition(String location) {
//        this.location = location;
//    }

//    public int getPlayerNum() {
//        return playersNum;
//    }

//    public void setPlayerNum(int playerNum) {
//        this.playersNum = playerNum;
//    }

    @Override
    public String toString() {

        return "Card{" +
                "rank=" +// rank +
                formatRank(rank) +
                ", suit=" + suit +
//                ", location=" + location +
//                ", playerNum=" + playersNum +
                //  ", ranks=" + ranks +
                '}';
    }
}
