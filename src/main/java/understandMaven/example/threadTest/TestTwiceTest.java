package understandMaven.example.threadTest;


public class TestTwiceTest {
    public static void main(String[] args) {
        TestTwice testTwice=new TestTwice();
        for (int i = 0; i < 10; i++) {
            new Thread(testTwice,"第"+(i+1)+"个探险家").start();
        }
    }
}