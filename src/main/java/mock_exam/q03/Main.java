package mock_exam.q03;

import java.util.*;
import java.util.stream.*;

public class Main {
        public static void main(String[] args) {
                List<Product> products = List.of(
                                new Product("A", "X"),
                                new Product("B", "X"),
                                new Product("C", "Y"),
                                new Product("D", "Y"),
                                new Product("E", "Z"),
                                new Product("F", "Z"));

                products.stream()
                                .collect(Collectors.groupingBy(Product::category,
                                                Collectors.mapping(Product::name, Collectors.joining(" "))))
                                .forEach((k, v) -> System.out.println(k + ": " + v));

        }
}

record Product(String name, String category) {
}