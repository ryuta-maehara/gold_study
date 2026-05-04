package mock_exam.q21;

import java.util.concurrent.atomic.AtomicInteger;

public class Sample {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger a = new AtomicInteger(0);
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                a.incrementAndGet();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(a.get());
    }
}
