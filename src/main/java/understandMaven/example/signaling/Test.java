package understandMaven.example.signaling;

public class Test {
    public static void main(String[] args) {
        GetMoonCake getMoonCake=new GetMoonCake();
        SetMoonCake setMoonCake=new SetMoonCake();
        Thread thread=new Thread(getMoonCake);
        Thread thread1=new Thread(setMoonCake);
        thread1.start();
        thread.start();
    }
}
