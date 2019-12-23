package understandMaven.example.synchAndLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    private Lock lock=new ReentrantLock();
    public void lockTes(Thread thread) throws InterruptedException {
        lock.lock();
        try {
            System.out.println(thread.getName()+"进来了...获取了当前的锁");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println(thread.getName()+"发生了异常，释放了锁...");
        }finally {
            System.out.println(thread.getName()+"正常执行完毕...释放了锁");
            lock.unlock();
        }

    }
}
