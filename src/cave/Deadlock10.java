//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

class Deadlock10 implements Runnable {
    Deadlock10() {
    }

    public void run() {
        System.out.println("10. Try lock to avoid deadlock");
        Deadlock10 deadlock = new Deadlock10();
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

        //(new CallableUsage(this)).callable();
        System.out.println();
    }
}
