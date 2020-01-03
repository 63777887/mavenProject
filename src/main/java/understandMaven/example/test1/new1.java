package understandMaven.example.test1;

import java.util.ArrayList;

public class new1 {
    static int count=1;
    static int count1=1;
    public static void main(String[] args) {

        ArrayList list=new ArrayList();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 4) {
                synchronized (this) {
                        list.add(1);
                        count++;
                        try {
                            Thread.sleep((int) Math.random() * 2000 + 1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                while (count1 < 4) {
                    synchronized (this) {
                        list.add(2);
                        count1++;
                        try {
                            Thread.sleep((int) Math.random() * 2000 + 1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
