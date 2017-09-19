//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class BlockingQueue7 implements Runnable {
    BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(10);
    AtomicInteger count = new AtomicInteger();

    BlockingQueue7() {
    }

    void produce() {
        while(this.count.get() < 10) {
            try {
                Thread.sleep(50L);
                this.blockingQueue.put(Integer.valueOf((new Random()).nextInt(100)));
                this.count.incrementAndGet();
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }
        }

    }

    void consume() {
        while(this.count.get() < 10 || !this.blockingQueue.isEmpty()) {
            try {
                Thread.sleep(100L);
                System.out.print(this.blockingQueue.take() + " ");
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }
        }

    }

    public void run() {
        System.out.println("7. Blocking Queue ");
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException var4) {
            var4.printStackTrace();
        }

        System.out.println();
    }
}
