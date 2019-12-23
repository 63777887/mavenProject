package understandMaven.example.lockTest;

public class LockOneTest {
    public static void main(String[] args) {
        final LockOne lockOne=new LockOne();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                lockOne.lockTes(Thread.currentThread());
            }
        },"线程1");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                lockOne.lockTes(Thread.currentThread());
            }
        },"线程2");
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                lockOne.lockTes(Thread.currentThread());
            }
        },"线程3");
        t1.start();
        t2.start();
        t3.start();
    }
}
