import java.util.Scanner;

public class Podatek {
    public static void main(String[] args) {

        double podstawa = 85528;
        System.out.println("podaj kwotę zarobkową:  ");
        Scanner scanner = new Scanner(System.in);
        double newValue = scanner.nextDouble();
        if( newValue <= podstawa){
            double wynik = ((newValue * 17)/100);
            System.out.println("wyynik to:" + " " + wynik);
        } else  if( newValue > podstawa){
            double wynikNowy = ((podstawa * 17)/100);
            System.out.println(" wynik przed przekroczeniem wartości: " + " " + wynikNowy);
            double moreValue = newValue - podstawa;
            double wynikLast = ((moreValue * 32)/100);
            System.out.println(" warość wynosi:" + wynikLast);
            double sum = wynikLast + podstawa + wynikNowy;
            System.out.println(sum);
        }
    }
}
