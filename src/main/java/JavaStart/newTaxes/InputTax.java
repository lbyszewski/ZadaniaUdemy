package JavaStart.newTaxes;

import java.util.Scanner;

public class InputTax {
    public static void main(String[] args) {
        CalculateTax calculateTax = new CalculateTax();
       // System.out.println("Podaj swoje wynagrodzenie: ");
        Scanner scanner = new Scanner(System.in);
        //double a = scanner.nextDouble();

        System.out.println("podaj wynagrodzenie żony: ");
        double wife = scanner.nextDouble();
        System.out.println("podaj wynagrodzenie męża: ");
        double husband = scanner.nextDouble();

       // double result = calculateTax.calculateSalary(a);
        //System.out.println(result);


        double result2 = calculateTax.newCalculation(wife, husband);
        System.out.println(result2);

    }
}
