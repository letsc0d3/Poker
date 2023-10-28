import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        System.out.print("Willkommen bei Poker-Maschien!");
        int amountOfPlayers = userInput.getNum("\nAnzahl Spieler: ");
        Game game = new Game(amountOfPlayers);
        game.distributeCard();
        game.distributeCard();
        game.distributeCard();
        for (Card card : game.getDeck()) {
            if (card.getPlayerNum() == 1) {
                System.out.println(card);
            }
            System.out.println(card);
        }
        System.out.println(game.getDeck().get(1).getRank());


    }

}
