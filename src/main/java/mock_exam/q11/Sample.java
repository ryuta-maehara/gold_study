package mock_exam.q11;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {

        Item a = new Item("apple", 100, Category.FRUITS);
        Item b = new Item("banana", 80, Category.FRUITS);
        Item c = new Item("carrot", 80, Category.VEGETABLES);
        Item d = new Item("tomato", 120, Category.VEGETABLES);

        List<Item> items = List.of(a, b, c, d);

        Map<Object, Optional<Item>> maxPriceItemByCategory = items.stream().collect(Collectors
                .groupingBy(i -> i.category(), Collectors.reducing((i1, i2) -> i1.price() > i2.price() ? i1 : i2)));

        maxPriceItemByCategory.forEach((k, v) -> System.out.println(k + " : " + v.orElse(null)));
    }
}
