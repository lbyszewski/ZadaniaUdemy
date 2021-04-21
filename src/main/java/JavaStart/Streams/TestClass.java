package JavaStart.Streams;

import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        Stream<Course> courseStream = Stream.of(
                new Course(1 , "programowanie Java", 5000, "średnia"),
                new Course(2 , "programowanie C#", 15000, "wysoka"),
                new Course(3 , "programowanie Javascript", 15000, "niska")
        );
        boolean myChouse = courseStream.anyMatch(course -> course.getPrice() <=5000);
        System.out.println(myChouse);
    }
}
