package JavaStart.superConstruction;

public class BookStore {
    public static void main(String[] args) {
        Computer computer = new Computer(2500, 4096);
        System.out.println(computer);

        Nootbook nootbook = new Nootbook(3200, 8192, 30000);
        System.out.println(nootbook.getCpu() + " " + nootbook.getMemorySize() + " " +  nootbook.getBatteryCapacity());
    }
}
