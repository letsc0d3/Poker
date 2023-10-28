import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private List<Card> deck;
    private int amountOfPlayers;

    public Game(int amountOfPlayers) {
        this.amountOfPlayers = amountOfPlayers;
        this.deck = new ArrayList<>();
        createDeck();
    }

    public void createDeck() {
        for (int i = 0; i < Suit.values().length; i++) {
            Suit suit = switch (i) {
                case 0 -> Suit.CLUBS;
                case 1 -> Suit.HEARTS;
                case 2 -> Suit.SPADES;
                case 3 -> Suit.DIAMONDS;
                default -> throw new IllegalStateException("Unexpected value: " + i);
            };
            Position position = Position.DECK;
            for (int j = 2; j <= 14; j++) {
                deck.add(new Card(j, suit, position, 0));
            }
        }
    }

    public void distributeCard() {
        for (int i = 0; i < amountOfPlayers; i++) {
            int index = ThreadLocalRandom.current().nextInt(0, deck.size());
            deck.get(index).setPlayerNum(i + 1);
            deck.get(index).setPosition(Position.PLAYER);
        }
    }

    public List<Card> getDeck() {
        return deck;
    }
}
