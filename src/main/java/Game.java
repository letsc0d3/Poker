import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private List<Card> deck;
    private int amountOfPlayers;
    private int stake;
    private Map<String, List<Card>> locationOfCards;

    UserInput userInput = new UserInput();


    public Game() {
        this.amountOfPlayers = userInput.getNum("\nAnzahl Spieler: ");
        this.deck = new ArrayList<>();
        this.stake = 0;
        createDeck();
        this.locationOfCards = new HashMap<>();
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
//            Location location = Location.DECK;
            for (int j = 2; j <= 14; j++) {
                deck.add(new Card(j, suit, "deck", 0));
            }
        }
    }

    public void distributeOneCardToEachPlayer() {
        for (int i = 1; i <= amountOfPlayers; i++) {
            int index = ThreadLocalRandom.current().nextInt(0, deck.size());
            String playerNum = "player" + i;

            if (!locationOfCards.containsKey(playerNum)) {
                List<Card> playerCards = new ArrayList<>();
                locationOfCards.put(playerNum, playerCards);
            }
                locationOfCards.get(playerNum).add(deck.get(index));
                deck.remove(index);
        }
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void askEachPlayerForStake() {

        for (int i = 1; i <= amountOfPlayers; i++) {
            String player = "player" + i;
            System.out.println();
            System.out.println("Player " + i + ", this is your hand:");
            for (Card card : locationOfCards.get(player)) {
//                if (card.getPlayerNum() == i) {
                System.out.println(card.getSuit() + " ->\t" + card.getRank());
            }
//            System.out.println(locationOfCards);
            int playersStake = userInput.getNum("What is your stake? Type \"0\" if you want to quit: ");

        }
    }
}

