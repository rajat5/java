//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ObjectLocks4 implements Runnable {
    Object lock1 = new Object();
    Object lock2 = new Object();
    List<Integer> list1 = new ArrayList();
    List<Integer> list2 = new ArrayList();

    ObjectLocks4() {
    }

    void add1() {
        Object var1 = this.lock1;
        synchronized(this.lock1) {
            this.list1.add(Integer.valueOf((new Random()).nextInt()));
        }
    }

    void add2() {
        Object var1 = this.lock2;
        synchronized(this.lock2) {
            this.list2.add(Integer.valueOf((new Random()).nextInt()));
        }
    }

    void add() {
        for(int i = 0; i < 100000; ++i) {
            this.add1();
            this.add2();
        }

    }

    public void run() {
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

        System.out.println("4. Object locks list1 :" + this.list1.size() + " list2 " + this.list2.size());
    }
}
