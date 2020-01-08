package understandMaven.example.signaling;

import understandMaven.example.testThree.singleton.Person;

public class SetMoonCake implements Runnable{
    private MoonCake moonCake;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+moonCake.getName());

    }
}
