package understandMaven.example.synchAndLock;

public class LockDemo {
    public static void main(String[] args) {
//        final LockTest lockTest=new LockTest();
        final LockNotWait lockTest=new LockNotWait();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lockTest.lockTes(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"线程A");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lockTest.lockTes(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"线程B");
        t1.start();
        t2.start();
    }
}
