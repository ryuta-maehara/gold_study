package q07;

import java.util.List;

public class Sample {

    public static void main(String[] args) {
        List<Item> items = List.of(new Item("Book", 100), new Item("Pen", 80), new Item("Notebook", 150));

        System.out.println(items.stream().filter(item -> item.price() < 50).map(Item::name).count());
    }
}
