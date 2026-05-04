package mock_exam.q18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {
        List<Integer> a = List.of(50, 60, 70, 80);
        List<Integer> b = List.of(40, 50, 60, 70);

        double avg = Stream.of(a, b).flatMap(List::stream).collect(Collectors.averagingDouble(d -> d));
        System.out.println(avg);
    }
}
