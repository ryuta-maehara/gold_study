package chapter06.q010;

import java.io.Serializable; // インスタンスをメモリからファイルに保存するためにSerializableインターフェースを実装する必要がある

public class Item implements Serializable {
  private String name;
  private int price;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Item [name='" + name + '\'' + ", price=" + price + ']';
  }
}
