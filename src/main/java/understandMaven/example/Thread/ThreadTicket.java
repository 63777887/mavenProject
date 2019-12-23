package understandMaven.example.Thread;

public class ThreadTicket implements Runnable{
    int ticket=50;
    @Override
    public void run() {

            boolean b=true;
            while (b) {
                synchronized (this) {
                    if (ticket>0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "第" + (ticket--) + "张票");
                    }else {
                        b=false;
                    }
            }

        }

    }
}
