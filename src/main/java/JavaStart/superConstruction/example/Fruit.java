package JavaStart.superConstruction.example;

import org.w3c.dom.ls.LSOutput;

public class Fruit {
    private double weight;
    private TypeOfFruit typeOfFruit;

    public Fruit(double weight, TypeOfFruit typeOfFruit) {
        this.weight = weight;
        this.typeOfFruit = typeOfFruit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public TypeOfFruit getTypeOfFruit() {
        return typeOfFruit;
    }

    public void setTypeOfFruit(TypeOfFruit typeOfFruit) {
        this.typeOfFruit = typeOfFruit;
    }

    public String getInfo(){

       String info = "to jest owoc o wadze " + getWeight() + " i typie " + getTypeOfFruit() ;

        return info;
    }
}
