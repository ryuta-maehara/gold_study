package chapter05.q08;

public class Sample {
  public static void main(String[] args) throws InterruptedException {
    Thread worker =
        new Thread(
            () -> {
              System.out.println("1: worker start");
              try {
                Thread.sleep(500);
              } catch (InterruptedException e) {
              }
              System.out.println("2: worker end");
            });

    worker.start();

    System.out.println("3: main thread");
    worker.join();
    System.out.println("4: main thread end");
  }
}
