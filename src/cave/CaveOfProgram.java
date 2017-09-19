//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

public class CaveOfProgram implements run {
    public CaveOfProgram() {
    }

    public static void main(String[] args) {
        (new CaveOfProgram()).start();
    }

    public void start() {
        try {
            (new StartingThreads1()).start();
            (new VolatileUse2()).start();
            this.runThread(new RaceCondition3());
            this.runThread(new ObjectLocks4());
           /* this.runThread(new ThreadPools5());
            this.runThread(new CountDownLatch6());
            this.runThread(new BlockingQueue7());
            this.runThread(new WaitNotify8());
            this.runThread(new ReentrantLock9());
            this.runThread(new Deadlock10());*/
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    void runThread(Runnable runnable) throws Exception {
        Thread ref = new Thread(runnable);
        ref.start();
        ref.join();
    }
}
