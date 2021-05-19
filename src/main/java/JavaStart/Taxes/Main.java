package JavaStart.Taxes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("podaj swoje wynagrodzenie: " );
        Scanner scanner = new Scanner(System.in);
        double wynagro = scanner.nextDouble();

        CalculTaxes calculTaxes = new CalculTaxes();

        TaxesService taxesService = new TaxesService();
        taxesService.calculateBalances(calculTaxes, wynagro);




    }
}
