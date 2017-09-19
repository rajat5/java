//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ThreadPools5 implements Runnable {
    ThreadPools5() {
    }

    public void run() {
        ExecutorService executors = Executors.newFixedThreadPool(5);

        for(int e = 0; e < 10; ++e) {
            executors.submit(new ThreadPools5());
        }

        System.out.println("5. Thread pool using executors");
        executors.shutdown();

        try {
            executors.awaitTermination(1L, TimeUnit.HOURS);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }

        System.out.println();
    }
}
