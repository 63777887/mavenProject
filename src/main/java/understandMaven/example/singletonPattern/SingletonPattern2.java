package understandMaven.example.singletonPattern;

public class SingletonPattern2 {
    private static SingletonPattern2 singletonPattern2;

    private SingletonPattern2() {
    }
    public static SingletonPattern2 create(){
        if (singletonPattern2 == null) {
            synchronized (SingletonPattern.class) {
                if (singletonPattern2 == null) {
                    singletonPattern2 = new SingletonPattern2();
                }
            }
        }
        return singletonPattern2;
    }
}
