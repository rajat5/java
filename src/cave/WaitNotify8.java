//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;


class WaitNotify8 implements Runnable {
    WaitNotify8() {
    }

    public void run() {
        System.out.println("8. wait and notify");
        WaitNotify8 waitAndNotify = new WaitNotify8();
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
