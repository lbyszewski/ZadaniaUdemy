package JavaStart.Polimorfizm.Cwiczenie;

public class Person {
    private String firstName;
    private String sureName;
    private double pricePerson;

    public Person(String firstName, String sureName, double pricePerson) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.pricePerson = pricePerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public double getPricePerson() {
        return pricePerson;
    }

    public void setPricePerson(double pricePerson) {
        this.pricePerson = pricePerson;
    }
}
