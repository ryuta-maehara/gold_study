package mock_exam.q13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("c", "d", "b", "a");
        // Collections.sort(list, (a, b) -> b.compareTo(a));
        // list.sort((a, b) -> a.compareTo(b));

        Collections.sort(list);
        list.forEach(e -> System.out.printf("%s", e));
    }
}
