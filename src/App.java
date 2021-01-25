import Exceptions.GameNotFoundException;
import Exceptions.NotEnoughMoneyException;
import Machine.GameMachine;
import Machine.GameMachineController;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws GameNotFoundException, NotEnoughMoneyException {
        Scanner sc = new Scanner(System.in);
        GameMachineController gmc = new GameMachineController();
        GameMachine gm = new GameMachine();
        gmc.showMenu();
        String gameTitle = gmc.getGameTitle(sc);
        int money = gmc.depositMoney(sc);
        gm.buy(gameTitle, money);
        gm.getBill();
    }
}
