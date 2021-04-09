import java.util.Scanner;

public class SilmpleCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę: ");
        int firstValue = scanner.nextInt();

        System.out.println("podaj drugą liczbę: ");
        int secondValue = scanner.nextInt();
        int wynik = 0;
            char znak = ' ';
        switch (znak){
            case '+':
                wynik = firstValue + secondValue;
                System.out.println(wynik);
            case '-':
                wynik = firstValue + secondValue;
                System.out.println(wynik);
            case '*':
                wynik = firstValue + secondValue;
                System.out.println(wynik);
            case '/':
                wynik = firstValue + secondValue;
                System.out.println(wynik);

        }
    }
}
