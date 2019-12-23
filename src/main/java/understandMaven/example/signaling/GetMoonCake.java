package understandMaven.example.signaling;

public class GetMoonCake implements Runnable{
    private MoonCake moonCake;
    int count=0;

    @Override
    public void run() {
        while (true){
            if (count%2==0){
                moonCake.setName("大白兔奶糖");
                moonCake.setWeight(0.5);
            }else {
                moonCake.setName("小龙人奶糖");
                moonCake.setWeight(0.3);
            }
        }

    }
}
