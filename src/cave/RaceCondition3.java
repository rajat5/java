//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

class RaceCondition3 implements Runnable {
    int count = 0;

    RaceCondition3() {
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

        System.out.println("3. Race condition count :4000000 actual :" + this.count);
        System.out.println("Use synchronized to prevent this");
    }
}
