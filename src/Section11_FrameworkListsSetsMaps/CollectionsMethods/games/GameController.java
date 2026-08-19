package Section11_FrameworkListsSetsMaps.CollectionsMethods.games;

import Section11_FrameworkListsSetsMaps.CollectionsMethods.games.poker.PokerGame;

public class GameController {

    public static void main(String[] args) {

        PokerGame fiveCardDraw = new PokerGame(4, 5);
        fiveCardDraw.startPlay();

    }
}
