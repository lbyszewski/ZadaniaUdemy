package JavaStart.Streams;

import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CwStream {
    public static void main(String[] args) {

        // Utwórz strumień kolejnych liczb całkowitych zaczynając od 0.
        // Następnie korzystając z metody filter() wybierz tylko te z nich, które są większe od 100, mniejsze od 1000 i podzielne przez 5
        // Wyświetl na ekranie pierwszych 10 liczb tego strumienia pomnożonych przez 3

        Stream.iterate(0, x-> x + 1)
                .filter(x -> x > 100 && x < 1000 && x % 5 == 0)
                .limit(10)
                .map(x -> x * 3)
                .forEach(System.out::println);


    }
}
