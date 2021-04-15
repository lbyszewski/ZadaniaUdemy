package JavaStart.Alogrithm;

import java.util.Scanner;

public class SumpleAlgorithm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rozmiar tablicy: " );
        int insertValue = scanner.nextInt();

        int sum = getSum(scanner, insertValue);
        System.out.println( "suma liczb wynosi: " + sum);
    }

    private static int getSum(Scanner scanner, int insertValue) {
        int [] tab = new int[insertValue];
        int sum =0 ;

        System.out.println("wprowadz liczbę do tablicy: ");


        for (int i = 0 ; i<tab.length; i++){
            int tabIndex = scanner.nextInt();
            tab[i] = tabIndex;
            if (tab[i] % 2 == 0){

                 sum += tab[i];
             }

        }
        return sum;
    }
}
