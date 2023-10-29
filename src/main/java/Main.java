public class Main {
    public static void main(String[] args) {

        System.out.print("Willkommen bei Poker-Maschien!");
        Game game = new Game();
        game.distributeOneCardToEachPlayer();
        game.distributeOneCardToEachPlayer();
//        for (Card card : game.getDeck()) {
//            if (card.getPlayerNum() == 1) {
//                System.out.println(card);
//            }
//            System.out.println(card);
//        }
//        System.out.println(game.getDeck().get(1).getRank());
//        System.out.println(game.getDeck().size());
        game.askEachPlayerForStake();



    }

}
