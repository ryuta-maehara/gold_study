package chapter05.q09;

public class Sample {
  public static void main(String[] args) {
    Object lock = new Object(); // monitorオブジェクト

    Thread A =
        new Thread(
            () -> {
              synchronized (lock) { // lockを獲得する
                System.out.println("1: A start");
                try {
                  System.out.println("2: A is waiting");
                  lock.wait(); // lockを解放して、notifyされるのを待つ
                } catch (Exception e) {
                }
                System.out.println("5: A resume");
              } // lockを解放する
            });

    Thread B =
        new Thread(
            () -> {
              try {
                Thread.sleep(100); // Aがlockを獲得するのを待つ
              } catch (InterruptedException e) {
              }
              synchronized (lock) { // lockを獲得する
                System.out.println("3: B start");
                System.out.println("4: B notify");
                lock.notify(); // Aを起こす
              } // lockを解放する
            });

    A.start();
    B.start();
  }
}
