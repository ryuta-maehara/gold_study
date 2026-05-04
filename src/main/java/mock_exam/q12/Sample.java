package mock_exam.q12;

import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5).filter(i -> {
            System.out.println("A");
            return i % 2 == 0;
        });

        System.out.println("B");
        stream.forEach(i -> System.out.println("forEach: " + i));
    }
}
