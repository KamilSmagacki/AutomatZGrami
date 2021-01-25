package Machine;

import Exceptions.NotEnoughMoneyException;

import java.util.ArrayList;
import java.util.List;

public class GameMachine {
    private final List<Game> games = new ArrayList<>();
    Game game;
    int theRest;

    public void buy(String gameTitle, int money) throws NotEnoughMoneyException {
        if (gameTitle.equals("Wiedźmin III") && money > 79.00) {
            game = new Game();
            game.title = "Wiedźmin III";
            games.add(game);
            theRest = money - 79;
        } else if (gameTitle.equals("Cyberpunk 2077") && money == 169.00) {
            game = new Game();
            game.title = "Cyberpunk 2077";
            games.add(game);
            theRest = money - 169;
        } else if (gameTitle.equals("Need for Speed Heat") && money == 105.00) {
            game = new Game();
            game.title = "Need for Speed Heat";
            games.add(game);
            theRest = money - 105;
        } else {
            throw new NotEnoughMoneyException("Wpłaciłeś za mało pieniędzy (pełny zwrót kosztów)");
        }
    }

    public void getBill() {
        if (theRest != 0) {
            System.out.println("Odbierz grę " + games.get(0).title);
            System.out.println("Odbierz resztę " + theRest + "zł");
        }
    }
}
