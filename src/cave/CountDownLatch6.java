//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CountDownLatch6 implements Runnable {
    CountDownLatch6() {
    }

    public void run() {
        ExecutorService executors = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(5);

        for(int e = 0; e < 5; ++e) {
            executors.submit(new CountDownLatch6());
        }

        System.out.println("6. Count down latch");
        executors.shutdown();

        try {
            executors.awaitTermination(1L, TimeUnit.HOURS);
        } catch (InterruptedException var4) {
            var4.printStackTrace();
        }

        System.out.println();
    }
}
