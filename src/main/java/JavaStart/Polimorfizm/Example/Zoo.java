package JavaStart.Polimorfizm.Example;

public class Zoo {
    public static void main(String[] args) {
        Animal [] animals = new Animal[3];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Klakier");
        animals[2] = new Animal("Zwierze");

        for (Animal animalss : animals) {
            animalss.getSound();
        }
    }
}
