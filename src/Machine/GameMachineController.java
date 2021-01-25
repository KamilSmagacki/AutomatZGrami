package Machine;

import Exceptions.GameNotFoundException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMachineController {
    public void showMenu() {
        System.out.println("Dostępne gry:");
        System.out.println("Wiedźmin III - 79zł");
        System.out.println("Cyberpunk 2077 - 169zł");
        System.out.println("Need for Speed Heat - 105zł");
    }

    public int depositMoney(Scanner sc) {
        try {
            System.out.println("Wpłać pieniądze");
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wpisuj tylko liczby");
        }
        return 0;
    }

    public String getGameTitle(Scanner sc) throws GameNotFoundException {
            System.out.println("Wpisz nazwe gry którą chcesz kupić:");
            String customerChoice = sc.nextLine();
            if (customerChoice.equals("Wiedźmin III"))
            return customerChoice;
            else if(customerChoice.equals("Cyberpunk 2077")) {
                return customerChoice;
            }
            else if(customerChoice.equals("Need for Speed Heat")) {
                return customerChoice;
            }
            else {
                throw new GameNotFoundException("Nie mamy takiej gry");
            }
    }
}
