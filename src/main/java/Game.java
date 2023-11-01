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
    private List<Player> players;
    private List<Card> hole;

    UserInput userInput = new UserInput();


    public Game() {
        this.amountOfPlayers = userInput.getNum("\nAnzahl Spieler: ");
        this.deck = new ArrayList<>();
        this.hole = new ArrayList<>();
        this.stake = 0;
        createDeck();
        this.locationOfCards = new HashMap<>();
        this.players = new ArrayList<>();
        for (int i = 1; i <= amountOfPlayers; i++) {
            players.add(new Player(i));
        }
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

    public void distributeThisManyCardsToEachPlayer(int amount) {
        for (int j = 0; j < amount; j++) {
            for (int i = 0; i < amountOfPlayers; i++) {
                int randomIndex = ThreadLocalRandom.current().nextInt(0, deck.size());
                Card randomCardFromDeck = deck.get(randomIndex);
                players.get(i).getPlayerCards().add(randomCardFromDeck);
                deck.remove(randomIndex);
            }
        }
    }


    public List<Card> getDeck() {
        return deck;
    }

    public void showHandAndAskForStake() {

        for (int i = 0; i < amountOfPlayers; i++) {
//            String player = "player" + i;
            System.out.println();
            System.out.println("Player " + (i + 1) + ", this is your hand:");
            for (Card card : players.get(i).getPlayerCards()) {
                System.out.println(card.getSuit() + " ->\t" + card.getRank());

            }


//            for (Card card : locationOfCards.get(player)) {
////                if (card.getPlayerNum() == i) {
//                System.out.println(card.getSuit() + " ->\t" + card.getRank());
//            }
//            System.out.println(locationOfCards);

            int playerRoundStake = userInput.getNum("What is your stake? Type \"0\" if you want to quit: ");
            evaluateStake(i, playerRoundStake);
        }
    }

    private void evaluateStake(int playerIndex, int playerRoundStake) {
        if (playerRoundStake == 0) {
            players.get(playerIndex).setHasQuit(true);
        } else {
            players.get(playerIndex).setPlayerTotalStake(players.get(playerIndex).getPlayerTotalStake() + playerRoundStake);
        }
    }

    public void putThisManyCardsIntoHole(int amount) {
        for (int i = 0; i < amount; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(0, deck.size());
            hole.add(deck.get(randomIndex));
            deck.remove(randomIndex);
        }
        printHole();
    }

    public void printHole() {
        System.out.println("These are the cards in the hole:");
        for (Card card : hole) {
            System.out.println(card.getSuit() + " ->\t" + card.getRank());
        }
    }
}

