package JavaStart.Bar;

import java.util.Scanner;

public class MainBar {
    public static void main(String[] args) {
        System.out.println("podaj nazwę drink: " );
        Barman barman = new Barman();

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Składnik nr 1: ");
        int portionA = scanner.nextInt();
        System.out.println("Składnik nr 2: ");
        int portionB = scanner.nextInt();
        System.out.println("Składnik nr 3: ");
        int portionC = scanner.nextInt();
        barman.creatDrink(name, portionA, portionB, portionC);
        barman.printDrink();
    }
}
