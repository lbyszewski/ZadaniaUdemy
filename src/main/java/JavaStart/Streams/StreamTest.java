package JavaStart.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9);
        int [] evenNumbers =  new int[9];
        intStream.filter( x -> x % 2 == 0 )
                .toArray();
        System.out.println(Arrays.toString(evenNumbers));
    }
}
