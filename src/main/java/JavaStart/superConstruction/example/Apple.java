package JavaStart.superConstruction.example;

public class Apple extends  Fruit{
    private String varianty;

    public Apple(double weight, TypeOfFruit typeOfFruit, String varianty) {
        super(weight, typeOfFruit);
        this.varianty = varianty;
    }

    public void setVarianty(String varianty) {
        this.varianty = varianty;
    }

    public String getVarianty() {
        return varianty;
    }
}
