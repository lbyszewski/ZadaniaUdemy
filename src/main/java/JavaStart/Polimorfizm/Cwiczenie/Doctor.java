package JavaStart.Polimorfizm.Cwiczenie;

public class Doctor extends Person{

    public Doctor(String firstName, String sureName, double pricePerson, double extraCash) {
        super(firstName, sureName, pricePerson);
        this.extraCash = extraCash;
    }



    private double extraCash;

    public double getExtraCash() {
        return extraCash;
    }

    public void setExtraCash(double extraCash) {
        this.extraCash = extraCash;
    }
}
