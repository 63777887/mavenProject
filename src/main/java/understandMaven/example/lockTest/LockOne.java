package understandMaven.example.lockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockOne {
    static int count=1;
    Lock lock=new ReentrantLock();
    public void lockTes(Thread thread){
        while (true) {
            lock.lock();
            try {
                System.out.println(thread.getName() + "第" + (count++) + "个执行");
                if (count == 4) {
                    count = 1;
                }
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}