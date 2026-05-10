package chapter01.q04;

public class Sample {

  public static void main(String[] args) {
    // Item<A> item = new Item<B>(); // ジェネリクスの型引数は、クラス宣言の型パラメータと同じでなければならないため、コンパイルエラーになります。
    Item<A> item = new Item<A>(); // こちらはジェネリクスの型引数がクラス宣言の型パラメータと同じであるため、コンパイルエラーにはなりません。
  }
}
