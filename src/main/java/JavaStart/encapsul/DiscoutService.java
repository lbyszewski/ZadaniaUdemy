package JavaStart.encapsul;

public class DiscoutService {
    public double calculateDiscountPrice(Client client, double price){
        if(client.isPremium()){
            return  calculatePremiumPrice(price);
        } else {
            return  calculateStandardPrice(price);
        }
    }

    private double calculatePremiumPrice(double price) {
        if (price > 1000){
            return  price *= 0.85;
        } else{
            return price *= 0.95;
        }
    }

    private double calculateStandardPrice( double price) {
        if(price > 1000){
            return price *= 0.9;
        } else {
            return price;
        }
    }
}
