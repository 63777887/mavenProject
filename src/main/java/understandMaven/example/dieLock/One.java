package understandMaven.example.dieLock;

public class One extends Thread {
    boolean b;

    public One(String name,boolean b) {
        super(name);
        this.b=b;
    }
    //                                            "沙哥牛逼！！！"

    @Override
    public void run() {
        if (b){
            synchronized (DieLock.objA){
                System.out.println(Thread.currentThread().getName()+"拿到了objA...");
                synchronized (DieLock.objB){
                    System.out.println(Thread.currentThread().getName()+"拿到了objB...");
                }
            }
        }else {
            synchronized (DieLock.objB){
                System.out.println(Thread.currentThread().getName()+"拿到了objB...");
                synchronized (DieLock.objA){
                    System.out.println(Thread.currentThread().getName()+"拿到了objA...");
                }
            }
        }
    }
}
