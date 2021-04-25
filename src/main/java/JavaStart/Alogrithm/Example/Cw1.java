package JavaStart.Alogrithm.Example;

import java.util.Scanner;

public class Cw1 {
    public static void main(String[] args) {
        //Napisz program, który będzie wczytywał od użytkownika kolejne liczby całkowite.
        // Wczytywanie liczb powinno zakończyć się w momencie, gdy użytkownik poda liczbę większą od 100.
        // Jeżeli suma wszystkich wprowadzonych liczb mniejszych bądź równych 100 jest liczbą parzystą, to wyświetl komunikat "parzysta", a jeżeli nie to "nieparzysta".


        System.out.println("podaj liczbę");
        Scanner scanner = new Scanner(System.in);

        int [] tab = new int[100];
        int sum = 0;
        for (int i = 0; i<100; i++){
            int addValue = scanner.nextInt();
            tab[i] = addValue;
            if (addValue > 100){

                break;
            }
            }
        }
    }

