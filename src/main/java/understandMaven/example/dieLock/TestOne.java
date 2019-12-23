package understandMaven.example.dieLock;

public class TestOne {
    public static void main(String[] args) {
        One p=new One("张三",true);
        One p1=new One("李四",false);
        p.start();
        p1.start();

    }
}
