package mock_exam.q26;

public class Sample {

  public static void main(String[] args) throws InterruptedException {
    Thread a = new Thread(() -> System.out.println("A"));
    Thread b = new Thread(() -> System.out.println("B"));
    Thread c = new Thread(() -> System.out.println("C"));

    c.start();
    a.run(); // mainスレッドで起動される。
    b.start();

    // 同じスレッドを起動しようとしてエラーになる。
    // 同一のスレッド起動は1回までしか許可されない。
    c.start();
  }
}
