package understandMaven.example.lockTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTwiceDel extends Thread {
    Tool tool;

    public LockTwiceDel(String name, Tool tool) {
        super(name);
        this.tool = tool;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tool) {
                if (!tool.b) {
                    if (tool.countDownLatch.getCount() > 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tool.del();
                        tool.countDownLatch.countDown();
                    } else {
                        try {
                            tool.countDownLatch.await();
                            tool.countDownLatch = new CountDownLatch(2);
                            tool.b = !tool.b;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            }
        }
    }
