package understandMaven.example.singletonPattern;

public class SingletonPattern {

    private static SingletonPattern singletonPattern=new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern create(){
        return singletonPattern;
    }
}
