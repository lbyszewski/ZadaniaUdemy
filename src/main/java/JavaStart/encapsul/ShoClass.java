package JavaStart.encapsul;

public class ShoClass {
    public static void main(String[] args) {
        Client client = new Client("Jan", "Kowalski", true);

        double price = 1200;
        DiscoutService discoutService = new DiscoutService();

        double discPrice = discoutService.calculateDiscountPrice(client, price);
        System.out.println("cena przed rabatem: " + price);
        System.out.println("cena po rabacie: " + discPrice);
    }
}
