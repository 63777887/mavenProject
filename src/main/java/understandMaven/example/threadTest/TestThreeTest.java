package understandMaven.example.threadTest;

import java.util.concurrent.CountDownLatch;

public class TestThreeTest {
    public static void main(String[] args) throws InterruptedException {
        TestThree testThree=new TestThree();
        Thread t1=new Thread(testThree,"A");
        Thread t2=new Thread(testThree,"B");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("A取了："+TestThree.getSumA()+"- - -"+"B取了："+TestThree.getSumB());

    }
}
