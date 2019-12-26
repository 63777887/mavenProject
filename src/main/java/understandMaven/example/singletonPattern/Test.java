package understandMaven.example.singletonPattern;

public class Test {
    public static void main(String[] args) {

        SingletonPattern s=SingletonPattern.create();
        SingletonPattern s2=SingletonPattern.create();
        SingletonPattern s3=SingletonPattern.create();
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());


        SingletonPattern2 s4=SingletonPattern2.create();
        SingletonPattern2 s5=SingletonPattern2.create();
        SingletonPattern2 s6=SingletonPattern2.create();
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());



    }
}
