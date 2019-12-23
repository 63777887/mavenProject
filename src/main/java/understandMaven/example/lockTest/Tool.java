package understandMaven.example.lockTest;

import java.util.concurrent.CountDownLatch;

public class Tool {
    CountDownLatch countDownLatch=new CountDownLatch(2);
    boolean b=true;
    public void add(){
        System.out.println(Thread.currentThread().getName() + "执行加1-->");
    }
    public void del(){
        System.out.println(Thread.currentThread().getName() + "执行减1-->");
    }
}
