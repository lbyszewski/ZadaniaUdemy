package JavaStart.Quenes;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQuenes {
    public static void main(String[] args) {
        Queue<Client> clients = new PriorityQueue<>();
        clients.add(new Client("Bartek", 40));
        clients.add(new Client("Krzysiek", 50));
        clients.add(new Client("Ania", 30));
        clients.add(new Client("Sylwia", 20));

        System.out.println(clients);
    }
}
