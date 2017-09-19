/**
 * Created by neo on 3/19/17.
 */
public class PrintOddEvenNumbers {
    public static void main(String[] args) throws Exception{
        new PrintOddEvenNumbers().way1();
    }
    public void way1() throws Exception{
        final Int i = new Int(0);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                if(i.get()%2==0){
                    synchronized(i){
                        System.out.println(i.get());
                        i.inc();
                        i.notifyAll();
                        try {i.wait();Thread.sleep(1000);} catch (InterruptedException e) {}
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                if(i.get()%2!=0){
                    synchronized(i){
                        System.out.println(i.get());
                        i.inc();
                        i.notifyAll();
                        try {i.wait();Thread.sleep(1000);} catch (InterruptedException e) {}
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
class Int{
    int i;
    Int(int i){this.i = i;}
    void inc(){i+=1;}
    int get(){return i;}
}
