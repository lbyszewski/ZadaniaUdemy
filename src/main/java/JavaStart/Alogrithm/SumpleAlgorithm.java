package JavaStart.Alogrithm;

import java.util.Scanner;

public class SumpleAlgorithm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rozmiar tablicy: " );
        int insertValue = scanner.nextInt();

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
        System.out.println( "suma liczb wynosi: " + sum);
    }
}
