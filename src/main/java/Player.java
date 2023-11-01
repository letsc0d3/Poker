import java.util.ArrayList;
import java.util.List;

public class Player {
    private int playerNum;
    private List<Card> playerCards;
    private int playerTotalStake;
    private boolean hasQuit;

    public Player(int playerNum) {
        this.playerNum = playerNum;
        this.hasQuit = false;
        this.playerCards = new ArrayList<>();
        this.playerTotalStake = 0;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public int getPlayerTotalStake() {
        return playerTotalStake;
    }

    public void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public boolean getHasQuit() {
        return hasQuit;
    }

    public void setHasQuit(boolean hasQuit) {
        this.hasQuit = hasQuit;
    }

    public void setPlayerTotalStake(int playerTotalStake) {
        this.playerTotalStake = playerTotalStake;
    }
}
