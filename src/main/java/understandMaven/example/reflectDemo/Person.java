package understandMaven.example.reflectDemo;

public class Person implements Lawsuit{
    @Override
    public void submit(String str) {
        System.out.println("张三提交了证据"+str);
    }

    @Override
    public void defend() {
        System.out.println("张三在法庭辩护。。。");
    }
}
