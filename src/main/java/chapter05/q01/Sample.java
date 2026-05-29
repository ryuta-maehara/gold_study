package chapter05.q01;

public class Sample {
  public static void main(String[] args) throws InterruptedException {
    Runnable target = () -> System.out.println("TARGET");

    Thread thread =
        new Thread(target) {

          // start()をオーバーライドしている。
          // start()はスレッドを起動するためのメソッドで、通常はThreadクラスのstart()が呼ばれると新しいスレッドが作成され、そのスレッドでrun()が呼び出される。
          @Override
          public synchronized void start() {
            super.start(); // Threadクラスのstart()が呼ばれる. 新しく起動したスレッドでrun()が呼び出される。
            System.out.println("A"); // Aはスレッドを起動したあとにmainスレッドで実行される。
          }

          // start()により新しく起動したスレッドでrun()が呼び出されるため、run()内の処理は新しいスレッドで実行される。
          @Override
          public void run() {
            try {
              Thread.sleep(1000); // 1秒スリープ

            } catch (Exception e) {
              e.printStackTrace();
            }
            super.run(); // Runnableのtargetを渡しているので、ここでtarget.run()が呼ばれる
            System.out.println("B");
          }
        };

    // 処理内容

    thread.start(); // start()を呼び出すと、スレッドが起動し、run()が新しいスレッドで実行される。start()内のAはmainスレッドで実行される。
    thread.join();
    thread.run(); // run()はスレッドを起動せず、呼び出し元のスレッドで実行される。ここではmainスレッドで実行される。
  }
}
