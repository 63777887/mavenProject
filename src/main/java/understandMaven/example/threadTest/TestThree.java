package understandMaven.example.threadTest;

public class TestThree implements Runnable{
    static int money=1000;
    static int sumA=0;
    static int sumB=0;

    public static int getSumA() {
        return sumA;
    }

    public static int getSumB() {
        return sumB;
    }

    @Override
    public void run() {
        while(money>0){
            synchronized (this){
                if (Thread.currentThread().getName().equals("A")){
                    if (money-100>=0) {
                        sumA += 100;
                        System.out.println("A的钱：" + "--->>>" + sumA);
                        money -= 100;
                    }
                }else {
                    if (money-200>=0) {
                        sumB += 200;
                        System.out.println("B的钱：" + "--->>>" + sumB);
                        money -= 200;
                    }
                }
            }
        }
    }
}
