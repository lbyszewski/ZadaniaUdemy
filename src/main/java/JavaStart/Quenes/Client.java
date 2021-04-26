package JavaStart.Quenes;

public class Client implements Comparable<Client> {
    private String nikname;
    private int ordersNumber;

    public Client(String nikname, int ordersNumber) {
        this.nikname = nikname;
        this.ordersNumber = ordersNumber;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public int getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(int ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nikname='" + nikname + '\'' +
                ", ordersNumber=" + ordersNumber +
                '}';
    }

    @Override
    public int compareTo(Client o) {
        return -Integer.compare(ordersNumber, o.ordersNumber);
    }
}
