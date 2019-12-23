package understandMaven.example.threadTest;

public class TestOne implements Runnable{
    int count=200;

    @Override
    public void run() {

        while(count<=400){
            synchronized (TestOne.class) {
                if (count % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + "--->>>"+count++);
                } else {
                    count++;
                }
            }
        }
    }
}
