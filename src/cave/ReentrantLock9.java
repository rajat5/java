//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;


class ReentrantLock9 implements Runnable {
    ReentrantLock9() {
    }

    public void run() {
        System.out.println("9. Reentrant lock await(wait) and signal(notify)");
        ReentrantLock9 waitAndNotify = new ReentrantLock9();
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException var5) {
            var5.printStackTrace();
        }

        System.out.println();
    }
}
