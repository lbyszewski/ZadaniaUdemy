package JavaStart.Polimorfizm.Cwiczenie;

public class Nurse extends Person{
    private double overtime;

    public Nurse(String firstName, String sureName, double pricePerson, double overtime) {
        super(firstName, sureName, pricePerson);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
