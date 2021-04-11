package JavaStart.encapsul;

import java.util.Scanner;

public class ShoClass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        DiscoutService discoutService = new DiscoutService();

        System.out.println("podaj imię klienta: " );
        String firstName = scanner.nextLine();

        System.out.println("podaj nazwisko klienta: " );
        String lastName = scanner.nextLine();

        System.out.println("podaj kwotę zamówienia:  "  );
        double priceBeforeDiscount = scanner.nextDouble();

        System.out.println("podaj czy jest premium czy nie: ");
        boolean premium = scanner.hasNextBoolean();

        Client client = new Client(firstName, lastName, premium);
        System.out.println("Dokonaj wyboru:");

                    if (premium == true){
                        double priceAfter = discoutService.calculateDiscountPrice(client, priceBeforeDiscount);
                        System.out.println(" zniżka po rabacie dla klienta wynosi" + " " + priceAfter);
                    } else  if( premium == false){
                        double priceBefor = discoutService.calculateDiscountPrice(client, priceBeforeDiscount);
                        System.out.println(" zniżka po rabacie dla klienta wynosi" + " " + priceBefor);
                    }
    }
}
