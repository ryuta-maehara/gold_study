package mock_exam.q22;

import java.util.stream.IntStream;

public class Sample {

    public static void main(String[] args) throws InterruptedException {

        IntStream values = IntStream.range(1, 5);
        // var p = values.allMatch(v -> v > 0);
        var n = values.noneMatch(v -> v < 0);

        // System.out.println(p + ":" + n);
        // System.out.println(p);
        System.out.println(n);
    }
}
