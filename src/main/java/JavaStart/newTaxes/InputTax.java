package JavaStart.newTaxes;

import java.util.Scanner;

public class InputTax {
    public static void main(String[] args) {
        CalculateTax calculateTax = new CalculateTax();
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        double result = calculateTax.calculateSalary(a);
        System.out.println(result);

    }
}
