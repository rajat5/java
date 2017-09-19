//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cave;

import cave.run;

class VolatileUse2 implements run {
    volatile boolean stop = false;

    VolatileUse2() {
    }

    public void start() {
        int i = 0;
        System.out.println("2. use of volatile to prevent optimization");

        while(!this.stop) {
            System.out.print(". ");

            try {
                Thread.sleep(10L);
                if(i++ > 10) {
                    this.shutdown();
                }
            } catch (InterruptedException var3) {
                ;
            }
        }

        System.out.println();
    }

    public void shutdown() {
        this.stop = true;
    }
}
