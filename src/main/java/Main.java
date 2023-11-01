public class Main {
    public static void main(String[] args) {

        System.out.print("Willkommen bei Poker-Maschien!");
        Game game = new Game();
        game.distributeThisManyCardsToEachPlayer(2);
//        for (Card card : game.getDeck()) {
//            if (card.getPlayerNum() == 1) {
//                System.out.println(card);
//            }
//            System.out.println(card);
//        }
//        System.out.println(game.getDeck().get(1).getRank());
//        System.out.println(game.getDeck().size());
        game.showHandAndAskForStake();
        game.putThisManyCardsIntoHole(3);
        game.showHandAndAskForStake();
        game.putThisManyCardsIntoHole(1);




    }

}
