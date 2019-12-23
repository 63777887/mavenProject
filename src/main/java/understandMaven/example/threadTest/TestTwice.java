package understandMaven.example.threadTest;


public class TestTwice implements Runnable{
    static int count=1;
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (TestTwice.class) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("顺序：" + "第" + (count++) + "个"+"--->>>名字：" + Thread.currentThread().getName());
        }
    }
}
