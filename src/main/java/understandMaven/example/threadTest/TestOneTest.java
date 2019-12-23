package understandMaven.example.threadTest;

public class TestOneTest {
    public static void main(String[] args) {
        TestOne testOne=new TestOne();
        Thread t1=new Thread(testOne,"线程1");
        Thread t2=new Thread(testOne,"线程2");
        Thread t3=new Thread(testOne,"线程3");
        t1.start();
        t2.start();
        t3.start();
    }

}
