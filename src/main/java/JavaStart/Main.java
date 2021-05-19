package JavaStart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        Silnia silnia =new Silnia();
        System.out.println(silnia.silnia(a));

    }
}
