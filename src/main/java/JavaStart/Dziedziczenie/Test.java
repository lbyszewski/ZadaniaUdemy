package JavaStart.Dziedziczenie;

public class Test {
    public static void main(String[] args) {
        Part part = new Part();
        part.nameProducent = "Fifko";
        part.model = "Eteta";
        part.seriesOfProduct = 12132324353d;

        ExhaustPart exhaustPart = new ExhaustPart();
        exhaustPart.acceptEuropeStandard = true;

        Tire tire = new Tire();
        tire.hight = 250;
        tire.size = 50;

    }
}
