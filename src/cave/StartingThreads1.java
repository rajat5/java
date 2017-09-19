//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

import cave.run;

class StartingThreads1 implements run {
    StartingThreads1() {
    }

    public void start() {
        System.out.println("1. ways to create thread");
        new StartingThreads1.Method1().start();
        new Thread(new StartingThreads1.Method2()).start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Method3 annonymous implementation");
            }
        }).start();

        try {
            Thread.sleep(10L);
        } catch (InterruptedException e) {
        }

        System.out.println();
    }

    class Method2 implements Runnable {
        Method2() {
        }

        public void run() {
            System.out.println("Method2 Implement runnable");
        }
    }

    class Method1 extends Thread {
        Method1() {
        }

        public void run() {
            System.out.println("Method1 Extend thread");
        }
    }
}
