package understandMaven.example.signaling;

public class SetMoonCake implements Runnable{
    private MoonCake moonCake;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+moonCake.getName());
    }
}
